package com.example.section1.repo;


import com.example.section1.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;




@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);
}
