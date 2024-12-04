package fr.cyril.customerdataservice.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cyril.customerdataservice.dto.CustomerDTO;
import fr.cyril.customerdataservice.entities.Customer;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.CustomerRequest;

@Component
public class CustomerMapper {

	ModelMapper mapper = new ModelMapper();

	public Customer from(CustomerDTO customerDTO) {

//		customer.setName(customerRequest.name());
//		customer.setEmail(customerRequest.email());

		//modelMapper
		return mapper.map(customerDTO, Customer.class);

	}
	
	
	public fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.Customer fromCustomer (Customer customer) {
		return mapper.map(customer, fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.Customer.Builder.class).build();
	}
	
	public Customer fromGrpcCustomerRequest (CustomerRequest customerRequest) {
		return mapper.map(customerRequest, Customer.class);
	}
}
