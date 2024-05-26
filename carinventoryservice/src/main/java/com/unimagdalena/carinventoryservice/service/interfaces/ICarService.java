package com.unimagdalena.carinventoryservice.service.interfaces;

import com.unimagdalena.carinventoryservice.persistence.dto.CarDtoSave;
import com.unimagdalena.carinventoryservice.persistence.dto.CarDtoSend;
import com.unimagdalena.carinventoryservice.persistence.entity.CarInventoryEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ICarService {
    Optional<CarDtoSend> findById(UUID uuid);
    List<CarDtoSend> findByAvaliableTrue();
    List<CarDtoSend> findAllByModel(String model);
    CarDtoSend save (CarDtoSave carDtoSave);
    CarDtoSend reserve(UUID id);
    CarDtoSend returnCar(UUID id, UUID idBooking);
}
