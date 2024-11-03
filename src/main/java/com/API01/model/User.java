//package com.API01.model;
//
//
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//
//import com.API01.Role;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.annotation.Nonnull;
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.ToString;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = "_email")})
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int _id;
//    @Nonnull
//    @NotEmpty
//    private String _firstName;
//    @Nonnull
//    @NotEmpty
//    private String _lastName;
//    @Nonnull
//    @Email
//    private String _email;
//    @Nonnull
//    @Enumerated(EnumType.STRING)
//    private Role _role;
//    @JsonIgnore
//    @ToString.Exclude
//    private String _password;
////    @OneToMany(mappedBy = "order_owner")
////    private List<Product> orders;
//
//
//}
