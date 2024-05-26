package com.unimagdalena.carinventoryservice.persistence.repository;

import com.unimagdalena.carinventoryservice.persistence.entity.CarInventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ICarRepository extends JpaRepository<CarInventoryEntity, UUID> {
    @Override
    Optional<CarInventoryEntity> findById(UUID uuid);
    List<CarInventoryEntity> findAllByAvaliableTrue();
    List<CarInventoryEntity> findAllByModel(String model);
}
