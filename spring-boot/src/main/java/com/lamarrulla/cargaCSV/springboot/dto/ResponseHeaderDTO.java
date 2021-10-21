package com.lamarrulla.cargaCSV.springboot.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseHeaderDTO {
    private static final long serialVersionUID = 1L;
    private List<HeaderDTO> headerDTOList;
}
