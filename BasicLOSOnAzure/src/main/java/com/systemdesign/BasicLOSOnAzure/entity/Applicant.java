/*
 * package com.systemdesign.BasicLOSOnAzure.entity;
 * 
 * import javax.annotation.Generated;
 * 
 * import javax.persistence.*; import jakarta.persistence.Entity; import
 * jakarta.persistence.GeneratedValue; import
 * jakarta.persistence.GenerationType; import jakarta.persistence.Id; import
 * jakarta.persistence.Table;
 * 
 * 
 * @Entity
 * 
 * @Table(name="customerTbl") public class Applicant extends BaseEntity {
 * 
 * public Applicant() { super("DefaultUser"); }
 * 
 * public Applicant(Long customerId, String name, String email, String
 * mobileNumber) {
 * 
 * super("DefaultUser"); this.customerId = customerId; this.name = name;
 * this.email = email; this.mobileNumber = mobileNumber; }
 * 
 * @Id //@Generated(strategy = GenerationType.IDENTITY)
 * 
 * @GeneratedValue(strategy=GenerationType.IDENTITY)
 * 
 * @Column(name="customer_id") private Long customerId;
 * 
 * private String name;
 * 
 * private String email;
 * 
 * private double loanAmount;
 * 
 * @Column(name="mobile_number") private String mobileNumber;
 * 
 * public Long getCustomerId() { return customerId; }
 * 
 * public void setCustomerId(Long customerId) { this.customerId = customerId; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public String getMobileNumber() { return mobileNumber; }
 * 
 * public void setMobileNumber(String mobileNumber) { this.mobileNumber =
 * mobileNumber; }
 * 
 * @Override public String toString() { return "Applicant [customerId=" +
 * customerId + ", name=" + name + ", email=" + email + ", mobileNumber=" +
 * mobileNumber + "]"; } }
 */