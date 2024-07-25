package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

    Page <Product> findBySellerId(long id);

}

