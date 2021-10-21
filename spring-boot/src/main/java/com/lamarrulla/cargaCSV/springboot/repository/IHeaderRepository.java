package com.lamarrulla.cargaCSV.springboot.repository;


import com.lamarrulla.cargaCSV.springboot.entity.Header;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHeaderRepository extends JpaRepository<Header, Long> {
}
