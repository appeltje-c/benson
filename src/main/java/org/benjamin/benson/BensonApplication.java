package org.benjamin.benson;

import org.benjamin.benson.entities.Customer;
import org.benjamin.benson.repositories.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BensonApplication {

	private static final Logger log = LoggerFactory.getLogger(BensonApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BensonApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {

		return (args) -> {

			repository.save(new Customer("Benjamin", "Rocha"));
			repository.save(new Customer("Reggie", "Rocha"));
			repository.save(new Customer("Mel", "Rocha"));

			log.info("Customer on file");
			repository.findAll().forEach(customer -> {

				log.info(customer.toString());
			});

		};

	}

}
