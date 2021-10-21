package com.lamarrulla.cargaCSV.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private Long articulo;
    private Long codigo;
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
