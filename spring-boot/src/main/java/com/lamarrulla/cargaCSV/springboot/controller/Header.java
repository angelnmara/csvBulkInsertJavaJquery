package com.lamarrulla.cargaCSV.springboot.controller;

import com.lamarrulla.cargaCSV.springboot.dto.HeaderDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseHeaderDTO;
import com.lamarrulla.cargaCSV.springboot.service.IHeaderService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Header {
    static final Logger logger = LogManager.getLogger(Header.class.getName());
    private final IHeaderService iHeaderService;

    public Header(IHeaderService iHeaderService) {
        this.iHeaderService = iHeaderService;
    }

    @GetMapping(value="/header")
    public ResponseEntity<ResponseHeaderDTO> getHeader(){
        return ResponseEntity.ok(iHeaderService.findAll());
    }
    @PostMapping(value="/header")
    public ResponseEntity<ResponseHeaderDTO> postHeader(@RequestBody HeaderDTO headerDTO){
        return ResponseEntity.ok(iHeaderService.save(headerDTO));
    }
    @PostMapping(value="/bulk-header")
    public ResponseEntity<ResponseHeaderDTO> bulkHeader(@RequestBody String bulk){
        return ResponseEntity.ok(iHeaderService.saveBulk(bulk));
    }
}
