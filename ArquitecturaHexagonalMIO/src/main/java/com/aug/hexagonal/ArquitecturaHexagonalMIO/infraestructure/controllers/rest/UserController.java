package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.rest;

import com.aug.hexagonal.ArquitecturaHexagonalMIO.application.services.UserServices;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities.User;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.in.UserRequestCreate;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.out.UserResponse;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.out.UserResponseCreate;
import com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserServices userService;
    private final UserMapper userMapper;

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable Long id) {
        return userMapper.fromUserToRes(userService.getUserById(id));
    }

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userMapper.fromUsertoUserResponseList(userService.getAllUsers());
    }

    @PutMapping
    public UserResponseCreate createUser(@RequestBody UserRequestCreate userReq) {
        User user = userService.guardar(userMapper.fromReqToUser(userReq));
        return userMapper.fromUserToResCreated(user);
    }

    @PatchMapping
    public UserResponseCreate modifyUser(@RequestBody UserRequestCreate userReq) {
        User user = userService.modificar(userMapper.fromReqToUser(userReq));
        return userMapper.fromUserToResCreated(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.eliminar(id);
    }
}
