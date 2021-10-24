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
    private String codProvedor;
    private String nomProvedor;
    private String tipoPedido;
    private String String1;
    private String String2;
    private String String3;
    private String numInter;
    private String numTrans;
}
