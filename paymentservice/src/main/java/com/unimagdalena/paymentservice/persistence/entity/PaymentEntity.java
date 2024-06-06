package com.unimagdalena.paymentservice.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "payments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private UUID id;
    private UUID bookingId;
    private String creditCard;
    private double amount;
    private Status status;
    private UUID transactionId;

    public enum Status {
        COMPLETED, CANCELLED, FAILED;
    }

}
