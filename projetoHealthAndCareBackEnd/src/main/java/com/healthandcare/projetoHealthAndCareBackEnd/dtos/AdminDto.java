package com.healthandcare.projetoHealthAndCareBackEnd.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AdminDto {

    @NotBlank
    private String user;

    @NotBlank
    private String password;

    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    private String nome;


}
