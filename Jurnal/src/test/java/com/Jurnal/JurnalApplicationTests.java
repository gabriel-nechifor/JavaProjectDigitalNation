package com.Jurnal;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Jurnal.controller.JurnalController;

@SpringBootTest
class JurnalApplicationTests {

	@Autowired
	private JurnalController service;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(service).isNotNull();
	}

}
