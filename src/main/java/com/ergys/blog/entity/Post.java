package com.ergys.blog.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

    @Column(name ="id" ,nullable = false, length = 255)
    private  Long id;
    @Column(name ="title" ,nullable = false, length = 255)
    private String title;
    @Column(name ="content" ,nullable = false)
    private String content;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

}
