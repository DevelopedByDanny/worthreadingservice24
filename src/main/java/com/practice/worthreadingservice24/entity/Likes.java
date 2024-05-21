package com.practice.worthreadingservice24.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(LikesId.class)
public class Likes {

    @Id
    private String messageId;
    @Id
    private String userId;

}
