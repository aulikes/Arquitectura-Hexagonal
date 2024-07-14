package com.aug.hexagonal.ArquitecturaHexagonalMIO.dominio.entities;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String email;
}
