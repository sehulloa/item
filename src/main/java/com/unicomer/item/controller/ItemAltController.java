package com.unicomer.item.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.unicomer.item.model.SkuDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ItemAltController {


	@Value("${url.ionAdapter.alternative}")
	private String urlIONAdapter;	

	@ApiOperation(value = "master", notes = "Create or replace an existing item.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente codigo de respuesta 0", response = SkuDTO.class),
			@ApiResponse(code = 204, message = "No Content. el servidor respondio bien pero sin contenido "),
			@ApiResponse(code = 400, message = "Bad Request. revisar codigo de errores ", response = SkuDTO.class),
			@ApiResponse(code = 500, message = "Error inesperado del sistema"), })

	@PostMapping("/alternative")
	public ResponseEntity<?> createOrModifyItemAlt(@Valid @RequestBody SkuDTO request, BindingResult bindingResult) {
		
		RestTemplate restTemplate = new RestTemplate();

		if (bindingResult.hasErrors()) {

			return null;
		}

		SkuDTO response = restTemplate.postForEntity(urlIONAdapter, request, SkuDTO.class).getBody();
		//Logger.info("Resp: " + response);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
