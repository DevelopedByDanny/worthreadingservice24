package com.practice.worthreadingservice24.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Likes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String messageId;
    private String userId;

    public Likes(String messageId, String userId) {
        this.messageId = messageId;
        this.userId = userId;
    }

    public Likes() {

    }
}
