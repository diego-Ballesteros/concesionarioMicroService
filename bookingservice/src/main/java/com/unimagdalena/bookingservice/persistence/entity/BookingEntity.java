package com.unimagdalena.bookingservice.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "booking")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private UUID id;
    private UUID carId;
    private UUID customerId;
    private Status status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public enum Status {
        CONFIRMED, CANCELLED, COMPLETED, FAILED;
    }

}
