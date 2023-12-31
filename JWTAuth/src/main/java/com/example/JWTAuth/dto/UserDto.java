package com.example.JWTAuth.dto;


import com.example.JWTAuth.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    String username;
    String password;
    Role role;

}
