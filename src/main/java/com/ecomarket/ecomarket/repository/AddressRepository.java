package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository <Address,Long> {

    List<Address> findBySellerId(long id);
    List<Address> findByCustomerId(long id);
}
