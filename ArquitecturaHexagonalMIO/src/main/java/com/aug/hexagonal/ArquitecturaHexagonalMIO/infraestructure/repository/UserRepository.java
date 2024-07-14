package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.repository;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
