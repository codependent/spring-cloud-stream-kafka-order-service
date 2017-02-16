package com.codependent.kafka.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.codependent.kafka.customer.stream.OrderProcessor;

@EnableBinding(OrderProcessor.class)
@SpringBootApplication
public class CustomerManagementDlqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementDlqApplication.class, args);
	}
}
