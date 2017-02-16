package com.codependent.kafka.customer.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OrderProcessor{
	
	final String OUTPUT = "ordersOut";
	final String INPUT = "ordersIn";
	
	@Input(INPUT)
	MessageChannel input();
	
	@Output(OUTPUT)
	MessageChannel output();
	
}
