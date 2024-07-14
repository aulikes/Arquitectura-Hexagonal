package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.mappers;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.in.UserRequestCreate;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.out.UserResponse;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.out.UserResponseCreate;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.entities.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity fromUserToUserEntity(User user);
    User fromUserEntityToUser(UserEntity userEntity);
    User fromReqToUser(UserRequestCreate userRequestCreate);
    UserResponse fromUserToRes(User user);
    UserResponseCreate fromUserToResCreated(User user);
    List<User> fromUserEntitytoUserList(List<UserEntity> userEntities);
    List<UserResponse> fromUsertoUserResponseList(List<User> user);
}
