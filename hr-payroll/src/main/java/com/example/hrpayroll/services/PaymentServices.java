package com.example.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.example.hrpayroll.entities.Payment;

@Service
public class PaymentServices {

	public Payment getPayment(long workerId, Integer days) {
		return new Payment("bob", 100.0, days);
	}

}
