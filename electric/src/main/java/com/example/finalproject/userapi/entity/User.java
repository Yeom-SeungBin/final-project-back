package com.example.finalproject.userapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "tbl_user")
public class User {

   @Id
   @Column(name = "user_id")
   @GeneratedValue(strategy = GenerationType.UUID)
   private String id;

   private String name;

   private String nickName;

   @Email
   private String email;

   private String password;

   private int phoneNumber;

   @Enumerated(EnumType.STRING)
   @Builder.Default
   private Role role =  Role.COMMON;

   @CreationTimestamp
   private LocalDateTime joinDate;

   private String profilePicture;

   private int carNumber;


}












































