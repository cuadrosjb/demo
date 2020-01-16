package com.payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository ){
        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + employeeRepository.save(new Employee("Frodo Baggins", "thief")));

            log.info("Preloading " + orderRepository.save(new Order("MacBook Pro", Status.COMPLETED)));
            log.info("Preloading " + orderRepository.save(new Order("iPhone", Status.IN_PROGRESS)));
        };
    }



}
