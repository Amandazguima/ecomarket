package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {

    Optional<SellerRepository> findByEmail(String email);
    boolean existsByEmail(String email);
}
