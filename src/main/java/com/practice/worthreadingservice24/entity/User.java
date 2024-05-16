package com.practice.worthreadingservice24.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @ManyToMany(mappedBy = "users")
    private Set<Message> messages;
}
