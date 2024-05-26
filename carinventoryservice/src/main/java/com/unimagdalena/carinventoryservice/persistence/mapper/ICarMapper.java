package com.unimagdalena.carinventoryservice.persistence.mapper;

import com.unimagdalena.carinventoryservice.persistence.dto.CarDtoSave;
import com.unimagdalena.carinventoryservice.persistence.dto.CarDtoSend;
import com.unimagdalena.carinventoryservice.persistence.entity.CarInventoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICarMapper {
 CarInventoryEntity carDtoSendToCarEntity(CarDtoSend car);
 CarInventoryEntity carDtoSaveToCarEntity(CarDtoSave car);
 CarDtoSend carEntityToCarDtoSend(CarInventoryEntity car);
 CarDtoSave carEntityToCarDtoSave(CarInventoryEntity car);

}
