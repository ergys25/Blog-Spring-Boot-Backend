package com.ergys.blog.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "post_tags")
public class PostTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;

    // Constructors, getters, and setters

    // Default constructor
    public PostTag() {
    }

    // Parameterized constructor
    public PostTag(Post post, Tag tag) {
        this.post = post;
        this.tag = tag;
    }


}
