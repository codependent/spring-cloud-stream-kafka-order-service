package com.codependent.kafka.customer.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private OrderProcessor orderProcessor;
	
	@StreamListener(OrderProcessor.INPUT)
	public void handle(String str){
		logger.info(str);
		if(!str.equals("CustomerCheckApproved")){
			if(Math.random() < 0.1){
				orderProcessor.output().send(MessageBuilder.withPayload("CustomerCheckApproved").build());
			}else{
 				throw new RuntimeException();
			}
		}
	}
	
}
