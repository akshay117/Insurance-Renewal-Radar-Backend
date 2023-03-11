package com.wecare.customermanagementservice.webcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.wecare.customermanagementservice.dao.Customer;
import com.wecare.customermanagementservice.repository.CustomerInsuranceRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1")
@Api(value = "Customer Insurance API", tags = {"Customer Insurance"})
public class CustomerInsuranceController {
    
    @Autowired
    private CustomerInsuranceRepository customerInsuranceRepository;
    
    @PostMapping
    @ApiOperation(value = "Add a new customer insurance")
    public Customer create(@RequestBody Customer customerInsurance) {
        return customerInsuranceRepository.save(customerInsurance);
    }
    
    @GetMapping("/{id}")
    @ApiOperation(value = "Get a customer insurance by ID")
    public Customer get(@PathVariable Long id) {
        return customerInsuranceRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    
    @PutMapping("/{id}")
    @ApiOperation(value = "Update a customer insurance by ID")
    public Customer update(@PathVariable Long id, @RequestBody Customer updatedInsurance) {
        return customerInsuranceRepository.findById(id)
            .map(insurance -> {
                insurance.setCustomer_name(updatedInsurance.getCustomer_name());
                insurance.setCustomer_phone_number(updatedInsurance.getCustomer_phone_number());
                insurance.setCustomer_vehicle_number(updatedInsurance.getCustomer_vehicle_number());
                insurance.setInsurance_provider_company(updatedInsurance.getInsurance_provider_company());
                insurance.setPremium_amount(updatedInsurance.getPremium_amount());
                insurance.setPath(updatedInsurance.getPath());
                insurance.setRemarks(updatedInsurance.getRemarks());
                return customerInsuranceRepository.save(insurance);
            })
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete a customer insurance by ID")
    public void delete(@PathVariable Long id) {
        customerInsuranceRepository.deleteById(id);
    }
}
