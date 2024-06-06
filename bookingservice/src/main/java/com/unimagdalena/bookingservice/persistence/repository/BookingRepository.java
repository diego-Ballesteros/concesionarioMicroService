package com.unimagdalena.bookingservice.persistence.repository;

import com.unimagdalena.bookingservice.persistence.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<BookingEntity, UUID> {

}
