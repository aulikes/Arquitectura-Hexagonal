package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.mappers;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.in.UserRequestCreate;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.out.UserResponseCreate;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromReqToUser(UserRequestCreate userRequestCreate);
    UserResponseCreate fromUserToRes(User user);
}
