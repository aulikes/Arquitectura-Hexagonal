package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.adapters;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.out.UserPersistencePort;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserPersistencePort {

    private final UserRepository userRepository;

    @Override
    public Optional<User> findById(Long id) {
        userRepository.findById(id);
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
