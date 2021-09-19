package com.lamarrulla.cargaCSV.springboot.service;

import com.lamarrulla.cargaCSV.springboot.dto.DetalleDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseDetalleDTO;

public interface IDetalleService {
    ResponseDetalleDTO findAll();
    ResponseDetalleDTO save(DetalleDTO detalleDTO);
    ResponseDetalleDTO saveBulk(String string);
}
