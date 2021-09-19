package com.lamarrulla.cargaCSV.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleDTO {
    private static final Long serialVersionUID = 1L;
    private Long idDetalle;
    private Long Articulo;
    private Long Codigo;
    private String Descripcion;
    private String Marca;
    private Long Depto;
    private Integer CantPedida;
    private String Medida;
    private Integer UniEmp;
    private String PreLista;
    private Double CostoNeto;
    private Double ImportePartida;
    private Integer CantEmpaques;
    private String TiendaDis;
}
