package com.unimagdalena.paymentservice.persistence.repository;

import com.unimagdalena.paymentservice.persistence.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IPaymentRepository extends JpaRepository<PaymentEntity, UUID> {

}
