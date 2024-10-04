package com.project.Product_01.data.dto;

import com.project.Product_01.data.entity.WishList;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
public class CreateUserDto {

    @Size(min = 5, message = "Name should consist of at least 5 characters")
    @Column(unique = true)
    @Pattern(regexp = "^[A-Za-z0-9@#$%&*]*$", message = "Invalid name format")
    @NotNull
    private String userName;

    @Email
    @Column(unique = true)
    @Pattern(regexp = "^[A-Za-z0-9@.]*$", message = "Invalid email format")
    @NotNull
    private String userEmail;

    @NotNull
    @Size(min = 3, message = "Password should consist of at least 3 characters")
    private String password;

    @Min(value = 6000000000l, message = "Phone number should range from 6000000000 to 9999999999")
    @Max(value = 9999999999l, message = "Phone number should range from 6000000000 to 9999999999")
    @Column(unique = true)
    private long userPhone;

    private String userAddress;

    @NotNull(message = "User role cannot be null")
    @Enumerated(EnumType.STRING)
    private String userRole;

}
