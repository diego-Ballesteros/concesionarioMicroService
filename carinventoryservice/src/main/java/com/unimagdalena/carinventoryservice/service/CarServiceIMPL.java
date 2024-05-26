package com.unimagdalena.carinventoryservice.service;

import com.unimagdalena.carinventoryservice.persistence.dto.CarDtoSend;
import com.unimagdalena.carinventoryservice.persistence.entity.CarInventoryEntity;
import com.unimagdalena.carinventoryservice.persistence.mapper.ICarMapper;
import com.unimagdalena.carinventoryservice.persistence.repository.ICarRepository;
import com.unimagdalena.carinventoryservice.service.interfaces.ICarService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CarServiceIMPL implements ICarService {

    private final ICarRepository iCarRepository;
    private final ICarMapper iCarMapper;

    public CarServiceIMPL(ICarRepository iCarRepository, ICarMapper iCarMapper) {
        this.iCarRepository = iCarRepository;
        this.iCarMapper = iCarMapper;
    }

    @Override
    public Optional<CarDtoSend> findById(UUID uuid) {
        Optional<CarInventoryEntity> car = this.iCarRepository.findById(uuid);
        CarDtoSend carDtoSend = this.iCarMapper.carEntityToCarDtoSend(car.get());
        return Optional.ofNullable(carDtoSend);
    }

    @Override
    public List<CarDtoSend> findByAvaliableTrue() {
        List<CarDtoSend> carDtoSendList = this.iCarRepository.findAllByAvaliableTrue()
                .stream().map(car -> this.iCarMapper.carEntityToCarDtoSend(car))
                .collect(Collectors.toList());
        return carDtoSendList;
    }

    @Override
    public List<CarDtoSend> findAllByModel(String model) {
        List<CarDtoSend> carDtoSendList = this.iCarRepository.findAllByModel(model)
                .stream().map(car -> this.iCarMapper.carEntityToCarDtoSend(car))
                .collect(Collectors.toList());
        return carDtoSendList;
    }
}
