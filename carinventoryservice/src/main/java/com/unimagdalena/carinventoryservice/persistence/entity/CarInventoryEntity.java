package com.unimagdalena.carinventoryservice.persistence.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "inventories")
public class CarInventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false, unique = true)
    private String model;
    @Column(nullable = false)
    private String maker;
    private Boolean avaliable;

}
