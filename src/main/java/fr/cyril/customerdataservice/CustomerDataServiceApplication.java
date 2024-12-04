package fr.cyril.customerdataservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.cyril.customerdataservice.entities.Customer;
import fr.cyril.customerdataservice.repositories.CustomerRepository;

@SpringBootApplication
public class CustomerDataServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerDataServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder().name("Cyril").email("cyril@gmail.com").build());
			customerRepository.save(Customer.builder().name("Marie").email("marie@gmail.com").build());
			customerRepository.save(Customer.builder().name("Trognon").email("trognon@gmail.com").build());
			customerRepository.save(Customer.builder().name("Lili").email("Lili@gmail.com").build());
		};
		
	};
	

}
