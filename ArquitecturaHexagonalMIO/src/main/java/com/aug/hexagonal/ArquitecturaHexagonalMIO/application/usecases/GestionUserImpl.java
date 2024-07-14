package com.aug.hexagonal.ArquitecturaHexagonalMIO.application.usecases;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.in.GestionUser;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.out.UserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GestionUserImpl implements GestionUser {

    private final UserPersistencePort userPersistencePort;

    @Override
    public User getUserById(Long id) {
        return userPersistencePort.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userPersistencePort.findAll();
    }

    @Override
    public User guardar(User user) {
        return userPersistencePort.save(user);
    }

    @Override
    public User modificar(User user) {
        return userPersistencePort.save(user);
    }

    @Override
    public void eliminar(Long id) {
        userPersistencePort.findById(id);
    }
}
