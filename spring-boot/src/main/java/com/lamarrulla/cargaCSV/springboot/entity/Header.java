package com.lamarrulla.cargaCSV.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="header")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private Date fechaInicio;
    private Date fechaEnt;
    private Date fechaCan;
    private Long noTienda;
    private String nomTiemda;
    private Long codProvedor;
    private String nomProvedor;
    private Integer tipoPedido;
    private Integer numInter;
    private Integer numTrans;
}
