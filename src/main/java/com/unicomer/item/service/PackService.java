package com.unicomer.item.service;

import org.springframework.http.ResponseEntity;

import com.unicomer.item.model.PackDTO;

public interface PackService {

	ResponseEntity<?> createItemPack(PackDTO packDTO, String warehouse, String country);
}
