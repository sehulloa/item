package com.unicomer.item.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.unicomer.item.exception.ApiErrorException;
import com.unicomer.item.model.PackDTO;


@Service
public class PackServiceImpl implements PackService {

	@Value("${url.ionAdapter}")
	private String url;

	Logger logger = LoggerFactory.getLogger(PackServiceImpl.class);

	@Override
	public ResponseEntity<?> createItemPack(PackDTO packDTO, String warehouse, String country) {

		RestTemplate restTemplate = new RestTemplate();

		try {
		String urlEndpoint = url + warehouse + "/packs/" + country;

		PackDTO response = restTemplate.postForEntity(urlEndpoint, packDTO, PackDTO.class).getBody();

		return new ResponseEntity<>(response, HttpStatus.OK);

		}catch (Exception e){
            logger.error("Error createItemPack()");
            logger.error(e.getMessage());

			throw new ApiErrorException(e);
        }
		
	}

}
