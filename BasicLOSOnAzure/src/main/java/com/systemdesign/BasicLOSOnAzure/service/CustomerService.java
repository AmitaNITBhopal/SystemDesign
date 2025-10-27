/*
 * package com.systemdesign.BasicLOSOnAzure.service;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.systemdesign.BasicLOSOnAzure.dto.CustomerDto; import
 * com.systemdesign.BasicLOSOnAzure.entity.Applicant; import
 * com.systemdesign.BasicLOSOnAzure.mapper.CustomerMapper; import
 * com.systemdesign.BasicLOSOnAzure.repository.CustomerRepository;
 * 
 * 
 * 
 * @Service public class CustomerService {
 * 
 * @Autowired private CustomerRepository customerRepository;
 * 
 * @Autowired public CustomerService(CustomerRepository customerRepository) {
 * super(); this.customerRepository = customerRepository; }
 * 
 * public void createCustomer(CustomerDto customerDto) { Applicant customer =
 * CustomerMapper.mapToCustomer(customerDto, new Applicant());
 * Optional<Applicant> optionalCustomer =
 * customerRepository.findByMobileNumber(customerDto.getMobileNumber());
 * if(optionalCustomer.isPresent()) {
 * 
 * 
 * throw new
 * CustomerAlreadyExistsException("Customer already registered with given mobileNumber "
 * +customerDto.getMobileNumber());
 * 
 * System.out.println("\n\nCustomer already exists!"); } else {
 * 
 * Applicant savedCustomer = customerRepository.save(customer); } }
 * 
 * public CustomerDto fetchAccount(String mobileNumber) { Applicant customer =
 * customerRepository.findByMobileNumber(mobileNumber).orElseThrow();
 * 
 * CustomerDto customerDto = CustomerMapper.mapToCustomerDto(customer, new
 * CustomerDto());
 * 
 * return customerDto; }
 * 
 * 
 * }
 */