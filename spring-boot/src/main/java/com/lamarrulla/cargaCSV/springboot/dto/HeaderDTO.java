package com.lamarrulla.cargaCSV.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HeaderDTO {
    private static final Long serialVersionUID = 1L;
    private Long idDetalle;
    private Date fechaInicio;
    private Date fechaEnt;
    private Date fechaCan;
    private Long noTienda;
    private String nomTiemda;
    private String codProvedor;
    private String nomProvedor;
    private String tipoPedido;
    private String String1;
    private String String2;
    private String String3;
    private String numInter;
    private String numTrans;
}
