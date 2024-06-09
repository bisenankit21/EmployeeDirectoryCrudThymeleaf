package com.luv2code.springboot.thymeleafDemo.dao;

import com.luv2code.springboot.thymeleafDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    //add a method to sort by lastName
    public List<Employee> findAllByOrderByLastNameAsc();  //Spring data JPA will parse the method name, looks for a specific formate and patter, create appropriate query behind the scene.


}
