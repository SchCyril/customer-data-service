package fr.cyril.customerdataservice.web;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import fr.cyril.customerdataservice.dto.CustomerDTO;
import fr.cyril.customerdataservice.entities.Customer;
import fr.cyril.customerdataservice.mappers.CustomerMapper;
import fr.cyril.customerdataservice.repositories.CustomerRepository;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CustomerGraphQLController {
	private CustomerRepository customerRepository;
	private CustomerMapper customerMapper;
	
	@QueryMapping
	public List<Customer> allCustomers() {
		return customerRepository.findAll();		
	};
	
	@QueryMapping
	public Customer customerById(@Argument Long id) {
		Customer customer = customerRepository.findById(id).orElse(null);
		if(customer == null) throw new RuntimeException(String.format("Customer %s not found", id));
		return customer;
	}
	
	@MutationMapping
	public Customer addCustomer(@Argument CustomerDTO customer) {
		Customer c = customerMapper.from(customer);
		return customerRepository.save(c);
		
	}
}
