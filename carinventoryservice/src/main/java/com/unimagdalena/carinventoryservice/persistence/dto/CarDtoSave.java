package com.unimagdalena.carinventoryservice.persistence.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CarDtoSave {
    @NotBlank(message = "El modelo es obligatorio")
    private String model;
    @NotBlank(message = "El fabricante es obligatorio")
    private String maker;
}
