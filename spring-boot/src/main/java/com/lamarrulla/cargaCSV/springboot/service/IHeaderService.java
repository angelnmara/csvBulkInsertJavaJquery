package com.lamarrulla.cargaCSV.springboot.service;

import com.lamarrulla.cargaCSV.springboot.dto.HeaderDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseHeaderDTO;

public interface IHeaderService {
    ResponseHeaderDTO findAll();
    ResponseHeaderDTO save(HeaderDTO headerDTO);
    ResponseHeaderDTO saveBulk(String string);
}
