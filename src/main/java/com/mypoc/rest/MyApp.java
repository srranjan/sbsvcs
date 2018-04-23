package com.mypoc.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JacksonJsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

/*
2 things only I did to start the service in mini cum iminimal mode:

(a) Comment out the Eureka stuff (apart from Redis Stuff) in yml
(b) Comment out everything here other than main method.

This works (at least in non-dockerized mode:
curl http://localhost:9091/clients/
At some point, we shall need to test this:
curl -X POST -H "Content-Type: application/json" -d "{\"id\":0,\"name\":\"Rajiv Ranjan\",\"phone\":\"3333333333\",\"address\":\"315 Front St\",\"potalCd\":\"M5V3A4\",\"type\":\"3\",\"balance\":\"333\"}" http://localhost:9091/clients/




 */

//@EnableDiscoveryClient
@SpringBootApplication
public class MyApp {
/*
	@Bean
	RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
			MessageListenerAdapter listenerAdapter) {

		RedisMessageListenerContainer container = new RedisMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.addMessageListener(listenerAdapter, new PatternTopic("updateClient"));

		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapter(Receiver receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}

	
	@Bean
	public MyPOJOMessageListener myPOJOMessageListener() {
	    return new MyPOJOMessageListener();
	}
	
	@Bean
	public RedisSerializer<MyClient> myClientSerializer() {
	    return new Jackson2JsonRedisSerializer(MyClient.class);
	}
	
	
	@Bean
	MessageListenerAdapter listenerAdapter() {
		
		MessageListenerAdapter adapter = new MessageListenerAdapter(myPOJOMessageListener());
	    adapter.setSerializer(myClientSerializer());
		//Jackson2JsonRedisSerializer
	    return adapter;
	}

	@Bean
	Receiver receiver() {
		return new Receiver();
	}

	*/
	
	 public static void main(String[] args) {
			//.run(MyRestController.class, args);
			SpringApplication.run(MyApp.class, args);
		}
	 
}
