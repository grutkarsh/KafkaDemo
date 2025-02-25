package com.example.kafka.KafkaDemo;







import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.kafka.controller.KafkaController;
import com.example.kafka.service.ProducerService;

/**
 * @author samiam
 *
 */
@SpringBootTest
class KafkaDemoApplicationTests {

	
	@Mock
	ProducerService producerService;
	
	@InjectMocks
	KafkaController kafkaController;
	
	//@BeforeEach
	//void init_mocks() {
	//	MockitoAnnotations.initMocks(this);
	//}
	
	@Test
	void test1()
	{
		when(producerService.sendMessage("hi")).thenReturn("mockitodone");
		assertEquals("mockitodone", kafkaController.sendMessageToKafkaTopic("hi"));
	}

}
