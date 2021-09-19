package com.lamarrulla.cargaCSV.springboot.repository;

import com.lamarrulla.cargaCSV.springboot.entity.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleRepository extends JpaRepository<Detalle, Long> {
}
