package com.ecomarket.ecomarket.repository;

import com.ecomarket.ecomarket.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

}
