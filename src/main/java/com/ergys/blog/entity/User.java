package com.ergys.blog.entity;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="username" ,unique = true, nullable = false, length = 50)
    private String username;

    @Column(name ="password", nullable = false, length = 255)
    private String password;

    @Column(name = "email",unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // Constructors, getters, and setters

    public User() {
        this.createdAt = LocalDateTime.now();
    }

    public User(Long id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }




}
