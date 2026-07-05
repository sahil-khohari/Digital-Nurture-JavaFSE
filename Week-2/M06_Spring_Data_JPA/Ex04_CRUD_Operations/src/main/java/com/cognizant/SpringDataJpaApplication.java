package com.cognizant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // CREATE
        Employee emp1 = repository.save(new Employee("Sahil", "Cyber Security"));
        Employee emp2 = repository.save(new Employee("Rahul", "IT"));

        System.out.println("\nEmployees Added Successfully!");

        // READ
        System.out.println("\nAll Employees:");
        List<Employee> employees = repository.findAll();
        employees.forEach(e ->
                System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment()));

        // FIND BY ID
        System.out.println("\nFinding Employee with ID " + emp1.getId());

        Optional<Employee> employee = repository.findById(emp1.getId());

        if (employee.isPresent()) {
            System.out.println(employee.get().getName());
        }

        // UPDATE
        employee.ifPresent(e -> {
            e.setDepartment("AI & Cyber Security");
            repository.save(e);
            System.out.println("\nEmployee Updated!");
        });

        // DELETE
        repository.deleteById(emp2.getId());
        System.out.println("\nEmployee Deleted!");

        // FINAL DATA
        System.out.println("\nRemaining Employees:");

        repository.findAll().forEach(e ->
                System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment()));
    }
}