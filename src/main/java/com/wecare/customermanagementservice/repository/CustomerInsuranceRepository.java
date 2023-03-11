package com.wecare.customermanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecare.customermanagementservice.dao.Customer;



public interface CustomerInsuranceRepository extends JpaRepository<Customer, Long> {

}
