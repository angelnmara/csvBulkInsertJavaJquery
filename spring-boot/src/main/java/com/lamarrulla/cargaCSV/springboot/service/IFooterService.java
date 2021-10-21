package com.lamarrulla.cargaCSV.springboot.service;

import com.lamarrulla.cargaCSV.springboot.dto.FooterDTO;
import com.lamarrulla.cargaCSV.springboot.dto.ResponseFooterDTO;

public interface IFooterService {
    ResponseFooterDTO findAll();
    ResponseFooterDTO save(FooterDTO footerDTO);
    ResponseFooterDTO saveBulk(String string);
}
