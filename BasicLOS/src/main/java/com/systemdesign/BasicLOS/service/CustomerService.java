package com.systemdesign.BasicLOS.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.systemdesign.BasicLOS.dto.CustomerDto;
import com.systemdesign.BasicLOS.entity.Applicant;
import com.systemdesign.BasicLOS.mapper.CustomerMapper;
import com.systemdesign.BasicLOS.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {

	private CustomerRepository customerRepository;
	
	public void createCustomer(CustomerDto customerDto) {
		Applicant customer = CustomerMapper.mapToCustomer(customerDto, new Applicant());
        Optional<Applicant> optionalCustomer = customerRepository.findByMobileNumber(customerDto.getMobileNumber());
        if(optionalCustomer.isPresent()) {
			/*
			 * throw new
			 * CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
			 * +customerDto.getMobileNumber());
			 */
        	System.out.println("\n\nCustomer already exists!");
        }
        
        Applicant savedCustomer = customerRepository.save(customer);
        
    }
	
	public CustomerDto fetchAccount(String mobileNumber) {
		Applicant customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow();
        
        CustomerDto customerDto = CustomerMapper.mapToCustomerDto(customer, new CustomerDto());
        
        return customerDto;
    }
	

}
