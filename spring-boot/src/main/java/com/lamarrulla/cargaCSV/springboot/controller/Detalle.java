package com.lamarrulla.cargaCSV.springboot.controller;

import com.lamarrulla.cargaCSV.springboot.dto.DetalleDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseDetalleDTO;
import com.lamarrulla.cargaCSV.springboot.service.IDetalleService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Detalle {

    static final Logger logger = LogManager.getLogger(Detalle.class.getName());
    private final IDetalleService iDetalleService;

    public Detalle(IDetalleService iDetalleService) {
        this.iDetalleService = iDetalleService;
    }

    @GetMapping(value="/detalle")
    public ResponseEntity<ResponseDetalleDTO> getDetalle(){
        return ResponseEntity.ok(iDetalleService.findAll());
    }
    @PostMapping(value="/detalle")
    public ResponseEntity<ResponseDetalleDTO> postDetalle(@RequestBody DetalleDTO detalleDTO){
        return ResponseEntity.ok(iDetalleService.save(detalleDTO));
    }
    @PostMapping(value="/bulk-detalle")
    public ResponseEntity<ResponseDetalleDTO> bulkDetalle(@RequestBody String bulk){
        return ResponseEntity.ok(iDetalleService.saveBulk(bulk));
    }
}
