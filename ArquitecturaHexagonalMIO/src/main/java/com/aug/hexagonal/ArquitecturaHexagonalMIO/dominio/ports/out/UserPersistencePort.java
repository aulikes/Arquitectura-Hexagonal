package com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.out;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserPersistencePort {
    User findById(Long id);
    List<User> findAll();
    User save(User user);
    void deleteById(Long id);
}
