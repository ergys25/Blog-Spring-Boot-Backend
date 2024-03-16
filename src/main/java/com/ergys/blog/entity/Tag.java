package com.ergys.blog.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name",unique = true, nullable = false, length = 50)
    private String name;

    public Tag() {
    }

    public Tag(Long id, String name) {
        this.name = name;
    }
}
