package com.unimagdalena.carinventoryservice.persistence.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CarDtoSend {
    private UUID id;
    private String model;
    private String maker;
    private boolean available;
}
