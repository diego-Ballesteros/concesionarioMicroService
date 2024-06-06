package com.unimagdalena.bookingservice.service;

import com.unimagdalena.bookingservice.persistence.entity.BookingEntity;

import java.util.List;

public interface IBookingService {
    List<BookingEntity> getAll();
}
