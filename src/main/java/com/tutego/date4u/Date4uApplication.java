package com.tutego.date4u;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.*;


import java.util.Arrays;

@SpringBootApplication
public class Date4uApplication {
	private  static final Logger log = LoggerFactory.getLogger(Date4uApplication.class);
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Date4uApplication.class, args);
		log.info("Log with arguments {} {} and {}", 1, "2", 3.0);

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		Arrays.stream(beanNames).forEach(System.out::println);
	}

}
