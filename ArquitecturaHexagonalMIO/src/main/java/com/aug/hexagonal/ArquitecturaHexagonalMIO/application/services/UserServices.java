package com.aug.hexagonal.ArquitecturaHexagonalMIO.application.services;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.in.GestionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServices {

    private final GestionUser gestionUser;

    public User guardar(User user) {
        return gestionUser.guardar(user);
    }

    public User modificar(User user) {
        return gestionUser.modificar(user);
    }

    public void eliminar(Long id) {
        gestionUser.eliminar(id);
    }
}
