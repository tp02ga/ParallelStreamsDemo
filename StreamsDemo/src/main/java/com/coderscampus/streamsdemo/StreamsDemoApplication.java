package com.coderscampus.streamsdemo;

import java.util.Date;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StreamsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamsDemoApplication.class, args);
		
//		Date start = new Date();
//		IntStream.range(0, 1000).parallel().forEach(i -> System.out.println(i));
//		Date end = new Date();
		
//		long length = end.getTime() - start.getTime();

		
		Date start = new Date();
		RestTemplate rt = new RestTemplate();
		
		IntStream.range(0, 100).parallel().forEach(i -> System.out.println(rt.getForObject("https://qrng.anu.edu.au/API/jsonI.php?length=1&type=uint8", RandomNumber.class).getData()[0]));
		
		Date end = new Date();
		long length = end.getTime() - start.getTime();
		System.out.println("It took " + length + " milliseconds to complete.");
	}
}
