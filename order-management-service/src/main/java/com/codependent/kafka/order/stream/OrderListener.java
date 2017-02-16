package com.codependent.kafka.order.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@StreamListener(OrderProcessor.INPUT)
	public void handle(String str){
		logger.info(str);
	}
	
}
