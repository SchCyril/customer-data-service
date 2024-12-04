package fr.cyril.customerdataservice.web;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.cyril.customerdataservice.dto.CustomerDTO;
import fr.cyril.customerdataservice.entities.Customer;
import fr.cyril.customerdataservice.mappers.CustomerMapper;
import fr.cyril.customerdataservice.repositories.CustomerRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
@WebService(serviceName = "CustomerWS")
public class CustomerSoapService {
	
	private CustomerRepository customerRepository;
	private CustomerMapper customerMapper;
	
	@WebMethod
	public List<Customer> customerList() {
		return customerRepository.findAll();
	}
	
	@WebMethod
	public Customer customerById(@WebParam Long id) {
		return customerRepository.findById(id).get();
	}
	
	public Customer addCustomer(@WebParam CustomerDTO customerDTO) {
		Customer customer = customerMapper.from(customerDTO);
		return customerRepository.save(customer);
	}
}
