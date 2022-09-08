package com.rodrigoramos.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoramos.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
