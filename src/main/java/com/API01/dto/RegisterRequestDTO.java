package com.API01.dto;

import lombok.Data;

@Data
public class RegisterRequestDTO {

    private String _firstName;
    private String _lastName;
    private String _email;
    private String _role;
    private String _password;

}
