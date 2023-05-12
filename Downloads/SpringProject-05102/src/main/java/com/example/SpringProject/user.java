package com.example.SpringProject;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}
