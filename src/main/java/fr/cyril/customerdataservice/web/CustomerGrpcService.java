package fr.cyril.customerdataservice.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import fr.cyril.customerdataservice.entities.Customer;
import fr.cyril.customerdataservice.mappers.CustomerMapper;
import fr.cyril.customerdataservice.repositories.CustomerRepository;
import fr.cyril.customerdataservice.stub.CustomerServiceGrpc.CustomerServiceImplBase;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerRequest;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.AddCustomerResponse;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CustomerGrpcService extends CustomerServiceImplBase {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public void getAllCustomers(GetAllCustomersRequest request,
			StreamObserver<GetAllCustomersResponse> responseObserver) {
		List<Customer> allCustomers = customerRepository.findAll();
		List<fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.Customer> allCustomersMapper = allCustomers
				.stream().map(customerMapper::fromCustomer).collect(Collectors.toList());

		GetAllCustomersResponse customersResponse = GetAllCustomersResponse.newBuilder()
				.addAllCustomers(allCustomersMapper).build();
		responseObserver.onNext(customersResponse);
		responseObserver.onCompleted();
	}

	@Override
	public void getCustomerById(GetCustomerByIdRequest request,
			StreamObserver<GetCustomerByIdResponse> responseObserver) {
		Customer customer = customerRepository.findById(request.getCustomerId()).get();
		GetCustomerByIdResponse customerByIdResponse = GetCustomerByIdResponse.newBuilder()
				.setCustomer(customerMapper.fromCustomer(customer)).build();

		responseObserver.onNext(customerByIdResponse);
		responseObserver.onCompleted();
	}

	@Override
	public void addCustomer(AddCustomerRequest request, StreamObserver<AddCustomerResponse> responseObserver) {
		Customer customer = customerMapper.fromGrpcCustomerRequest(request.getCustomer());
		Customer addCustomer = customerRepository.save(customer);
		
		AddCustomerResponse customerResponse = AddCustomerResponse.newBuilder()
				.setCustomer(customerMapper.fromCustomer(addCustomer))
				.build();
		
		responseObserver.onNext(customerResponse);
		responseObserver.onCompleted();		
	}

}
