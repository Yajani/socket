package com.websocket.socket.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "User")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "user_email", unique = true, length = 200)
    private String userEmail;

    @Column(name = "user_password", length = 500)
    private String userPassword;

    @Column(name = "user_name", length = 30)
    private String userName;

    @Column(name = "user_nickname", length = 30)
    private String nickname;



}
