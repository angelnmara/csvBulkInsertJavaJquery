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
