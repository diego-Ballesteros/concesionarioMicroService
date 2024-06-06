package com.unimagdalena.bookingservice.service;

import com.unimagdalena.bookingservice.persistence.entity.BookingEntity;
import com.unimagdalena.bookingservice.persistence.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceIMPL implements IBookingService {
    private final BookingRepository bookingRepository;
    public BookingServiceIMPL(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    public List<BookingEntity> getAll(){
        return this.bookingRepository.findAll();
    }
}
