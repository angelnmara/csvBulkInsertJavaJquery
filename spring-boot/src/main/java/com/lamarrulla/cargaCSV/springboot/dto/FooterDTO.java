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
    private Double luno;
    private Double ldos;
    private Double total;
}
