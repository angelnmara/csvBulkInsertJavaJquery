package com.lamarrulla.cargaCSV.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FooterDTO {
    private static final Long serialVersionUID = 1L;
    private Long idFooter;
    private Long luno;
    private Long ldos;
    private Long total;
}
