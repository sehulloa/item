package com.unicomer.item.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.unicomer.item.model.Errors;
import com.unicomer.item.model.GeneralResponse;
import com.unicomer.item.utils.CommonConstants;

@RestControllerAdvice
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ApiErrorException.class)
	public ResponseEntity<Object> handleApiErrorException(ApiErrorException ex) {

		List<Errors> errors = new ArrayList<>();
		GeneralResponse generalResponse = null;
		String exceptionCode = "";
		String exceptionTitle = "";
		HttpStatus exceptionStatus = null;
		
        String detailMessage = StringUtils.substringBefore(ex.getMessage(), "; nested exception is");
		String status = detailMessage.substring(0,3);
		
		switch (status) {
		case "400":
			exceptionCode = CommonConstants.STRING_HTTP_CODE_BAD_REQUEST;
			exceptionTitle = CommonConstants.BAD_REQUEST;
			exceptionStatus = HttpStatus.BAD_REQUEST;
			break;
		case "401":
			exceptionCode = CommonConstants.STRING_HTTP_CODE_UNAUTHORIZED;
			exceptionTitle = CommonConstants.UNAUTHORIZED;
			exceptionStatus = HttpStatus.UNAUTHORIZED;
			break;
		case "405":
			exceptionCode = CommonConstants.STRING_HTTP_CODE_METHOD_NOT_ALLOWED;
			exceptionTitle = CommonConstants.METHOD_NOT_ALLOWED;
			exceptionStatus = HttpStatus.METHOD_NOT_ALLOWED;
			break;
		default:
			exceptionCode = CommonConstants.STRING_HTTP_CODE_ERROR_INTERNAL_SERVICE;
			exceptionTitle = CommonConstants.INTERNAL_SERVER_ERROR;
			exceptionStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			break;
		}
		
		errors.add(new Errors(exceptionCode, UUID.randomUUID().toString(), exceptionTitle, detailMessage));
		generalResponse = new GeneralResponse(exceptionCode, CommonConstants.ERROR_ITEM_PACK, errors);
		
		return new ResponseEntity<>(generalResponse, exceptionStatus);

	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		GeneralResponse generalResponse = new GeneralResponse();

		List<Errors> errors = ex
				.getBindingResult().getFieldErrors().stream().map(x -> new Errors(CommonConstants.STRING_HTTP_CODE_BAD_REQUEST,
						UUID.randomUUID().toString(), CommonConstants.BAD_REQUEST, x.getDefaultMessage()))
				.collect(Collectors.toList());

		generalResponse.setResponseCode(String.valueOf(status.value()));
		generalResponse.setResponseDescription("Errors in request data");
		generalResponse.setErrors(errors);

		return new ResponseEntity<>(generalResponse, status);
	}

}
