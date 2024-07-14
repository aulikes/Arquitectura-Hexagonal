package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.adapters;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.ports.out.UserPersistencePort;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.entities.UserEntity;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.mappers.UserMapper;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserPersistencePort {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User findById(Long id) {
        UserEntity userEntity = userRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException("User not found with id " + id));

        return userMapper.fromUserEntityToUser(userEntity);
    }

    @Override
    public List<User> findAll() {
        List<UserEntity> listUserEntity = userRepository.findAll();
        return userMapper.fromUserEntitytoUserList(listUserEntity);
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = userMapper.fromUserToUserEntity(user);
        userEntity = userRepository.save(userEntity);
        return userMapper.fromUserEntityToUser(userEntity);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
