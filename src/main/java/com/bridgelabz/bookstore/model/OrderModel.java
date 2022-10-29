package com.bridgelabz.bookstore.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bridgelabz.bookstore.dto.OrderPlacedDto;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
@Entity
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long orderId;

	private LocalDateTime orderDate;
	private double price;
	private int quantity;
	private String Address;
	private long userId;
	private long bookId;
	private boolean cancel;
}