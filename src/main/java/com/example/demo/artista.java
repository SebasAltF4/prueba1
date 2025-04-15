package com.example.demo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    @ManyToMany(mappedBy = "artistas")
    private List<cancion> canciones;
}
