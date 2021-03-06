package com.ocr.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineCourseRegisterationApplication {
	
	private static final Class<OnlineCourseRegisterationApplication> ocrClass = OnlineCourseRegisterationApplication.class;
	private static final Logger log = LoggerFactory.getLogger(ocrClass);

	public static void main(String[] args) {
		SpringApplication.run(ocrClass, args);
	}
}
