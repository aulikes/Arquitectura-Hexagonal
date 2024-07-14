package com.aug.hexagonal.ArquitecturaHexagonalMIO.infraestructure.controllers.out;

import lombok.Data;

@Data
public class UserResponseCreate {
    private String name;
    private String email;
}
