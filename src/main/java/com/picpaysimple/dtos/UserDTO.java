package com.picpaysimple.dtos;

import java.math.BigDecimal;

import com.picpaysimple.domain.user.UserType;

public record UserDTO(String firstName, 
                      String lastName, 
                      String document, 
                      BigDecimal balance, 
                      UserType userType, 
                      String email, 
                      String password) {
}