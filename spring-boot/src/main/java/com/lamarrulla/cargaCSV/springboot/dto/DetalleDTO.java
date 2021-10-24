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
    private String articulo;
    private String codigo;
    private String descripcion;
    private String marca;
    private Long depto;
    private Integer cantPedida;
    private String medida;
    private Integer uniEmp;
    private String preLista;
    private Double costoNeto;
    private Double importePartida;
    private Integer cantEmpaques;
    private String tiendaDis;
}
