package com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.in;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;

import java.util.List;

public interface GestionUser {
    User getUserById(Long id);
    List<User> getAllUsers();
    User guardar(User user);
    User modificar(User user);
    void eliminar(Long id);
}
