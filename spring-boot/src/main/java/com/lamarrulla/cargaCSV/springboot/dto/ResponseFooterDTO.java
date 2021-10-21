package com.lamarrulla.cargaCSV.springboot.dto;

import lombok.Data;

import java.util.List;

@Data
public class ResponseFooterDTO {
    private static final long serialVersionUID = 1L;
    private List<FooterDTO> footerDTOList;

    public ResponseFooterDTO(List<FooterDTO> entityToDTOFooterList) {
        this.footerDTOList = entityToDTOFooterList;
    }
}
