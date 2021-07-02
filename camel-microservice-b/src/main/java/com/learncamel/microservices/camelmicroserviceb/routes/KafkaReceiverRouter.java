package com.learncamel.microservices.camelmicroserviceb.routes;

import java.math.BigDecimal;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learncamel.microservices.camelmicroserviceb.CurrencyExchange;

//@Component
public class KafkaReceiverRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		from("kafka:myKafkaTopic")
		.to("log:received-message-from-kafka");
		
	}

}
