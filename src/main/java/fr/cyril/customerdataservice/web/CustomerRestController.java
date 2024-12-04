package fr.cyril.customerdataservice.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.cyril.customerdataservice.entities.Customer;
import fr.cyril.customerdataservice.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@AllArgsConstructor // dependency injection
public class CustomerRestController {
	private CustomerRepository customerRepository;
	
	
	@GetMapping("/customers")
	public List<Customer> customerList() {
		return customerRepository.findAll();
	}

	@GetMapping("/customers/{id}")
	public Customer customerById(@PathVariable Long id) {
		return customerRepository.findById(id).get();
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
}
