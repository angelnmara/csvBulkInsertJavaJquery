package com.lamarrulla.cargaCSV.springboot.controller;

import com.lamarrulla.cargaCSV.springboot.dto.FooterDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseFooterDTO;
import com.lamarrulla.cargaCSV.springboot.service.IFooterService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Footer {
    static final Logger logger = LogManager.getLogger(Footer.class.getName());
    private final IFooterService iFooterService;

    public Footer(IFooterService iFooterService) {
        this.iFooterService = iFooterService;
    }

    @GetMapping(value="/footer")
    public ResponseEntity<ResponseFooterDTO> getFooter(){
        return ResponseEntity.ok(iFooterService.findAll());
    }
    @PostMapping(value="/footer")
    public ResponseEntity<ResponseFooterDTO> postFooter(@RequestBody FooterDTO footerDTO){
        return ResponseEntity.ok(iFooterService.save(footerDTO));
    }
    @PostMapping(value="/bulk-footer")
    public ResponseEntity<ResponseFooterDTO> bulkFooter(@RequestBody String string){
        return ResponseEntity.ok(iFooterService.saveBulk(string));
    }
}
