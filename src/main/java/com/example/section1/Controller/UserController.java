package com.example.section1.Controller;


import com.example.section1.model.Customer;
import com.example.section1.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;



    @PostMapping("/register")
    public ResponseEntity<String> registeruser(@RequestBody Customer customer) {
        try {
            String encodedPassword = passwordEncoder.encode(customer.getPwd());
            customer.setPwd(encodedPassword);
            Customer savecustomer = customerRepo.save(customer);

            if (savecustomer.getId() > 0) {
                return ResponseEntity.status(HttpStatus.CREATED).body("user created successfully");
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("user registration failed");
            }

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
