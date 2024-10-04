package com.project.Product_01.data.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Entity(name = "Users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_id")
    @SequenceGenerator(name = "user_id", initialValue = 1, allocationSize = 1, sequenceName = "user_sequence")
    private int userId;

    @Size(min = 5, message = "Name should consist of at least 5 characters")
    @Column(unique = true)
    @Pattern(regexp = "^[A-Za-z0-9@#$%&*]*$" ,message = "Invalid name format" )
    @NotNull
    private String userName;

    @Email
    @Column(unique = true)
    @Pattern(regexp = "^[A-Za-z0-9@.]*$" ,message = "Invalid email format" )
    @NotNull
    private String userEmail;

    @NotNull
    @Size(min = 3, message = "Password should consist of at least 3 characters")
    private String password;

    @Min(value = 6000000000l, message = "Phone number should range from 6000000000 to 9999999999")
    @Max(value = 9999999999l, message = "Phone number should range from 6000000000 to 9999999999")
    private long userPhone;

    private String userAddress;

    @NotNull(message = "User role cannot be null")
    @Enumerated(EnumType.STRING)
    private String userRole;


//    private Map<String,List<String>> wishList;

    @OneToMany(cascade = CascadeType.ALL)
    private List<WishList> wishLists;

//    private WishList wishList;

}
