package com.systemdesign.BasicLOS.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.systemdesign.BasicLOS.entity.Applicant;

public interface CustomerRepository extends JpaRepository<Applicant, Long> {
	Optional<Applicant> findByMobileNumber(String mobileNumber);
	
}
