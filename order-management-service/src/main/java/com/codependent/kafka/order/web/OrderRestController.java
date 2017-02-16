package com.codependent.kafka.order.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codependent.kafka.order.stream.OrderProcessor;

@RestController
public class OrderRestController {

	@Autowired
	private OrderProcessor orderProcessor;
	
	@GetMapping("/createOrder")
	public void createOrder(){
		orderProcessor.output().send(MessageBuilder.withPayload("OrderCreated"+Math.random()).build());
	}
	
}
