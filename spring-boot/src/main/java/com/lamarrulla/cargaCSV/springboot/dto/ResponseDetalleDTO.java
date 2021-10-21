package com.lamarrulla.cargaCSV.springboot.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResponseDetalleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<DetalleDTO> detalleDTOList;
}
