package com.aug.hexagonal.ArquitecturaHexagonalMIO.application.usecases;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.in.GestionUser;

import java.util.List;

public class GestionUserImpl implements GestionUser {

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User guardar(User user) {
        return null;
    }

    @Override
    public User modificar(User user) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }
}
