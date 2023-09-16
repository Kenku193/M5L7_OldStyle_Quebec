package org.example.service;

import org.example.entity.Customer;
import org.example.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private Repo<Customer> customerRepo;

    @Autowired
    public void setCustomerRepo(Repo<Customer> customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer get(Long id){
        return customerRepo.getById(id).orElseThrow();
    }

    public void update(Customer customer){
        customerRepo.update(customer);
    }


}
