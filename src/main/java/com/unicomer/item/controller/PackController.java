package com.unicomer.item.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unicomer.item.model.GeneralResponse;
import com.unicomer.item.model.PackDTO;
import com.unicomer.item.service.PackService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;

@RestController
@SwaggerDefinition(consumes = {"application/json"},
produces = {"application/json"},
schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS})
public class PackController {
	
	@Autowired
	PackService packService;

	@ApiOperation(value = "pack", notes = "This service allows to create or modify an item pack in WMS")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK. The resource is obtained successfully.", response = PackDTO.class),
            @ApiResponse(code = 204, message = "No Content. The server responded with no content."),
            @ApiResponse(code = 400, message = "Bad Request.", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Unexpected system error.", response = GeneralResponse.class)
    })
	@PostMapping("/{warehouse}/packs/{country}")
	public ResponseEntity<Object> createOrModifyPack(@Valid @RequestBody PackDTO request,
			@PathVariable String warehouse,
			@PathVariable String country) {
		
		return (ResponseEntity) packService.createItemPack(request, warehouse, country);
	}

}
