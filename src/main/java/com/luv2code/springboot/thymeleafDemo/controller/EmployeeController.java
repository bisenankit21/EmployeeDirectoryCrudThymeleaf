package com.luv2code.springboot.thymeleafDemo.controller;

import com.luv2code.springboot.thymeleafDemo.entity.Employee;
import com.luv2code.springboot.thymeleafDemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;
//Since only one Constructor @Autowired is optional

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //add Mapping for listing a employee
    @GetMapping("list")
    public String listEmployee(Model model){
        //get the employee from Db
        List<Employee> employees=employeeService.findAll();
        //add to the spring model
        model.addAttribute("employees", employees);
        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        //create model attribute to bind the form data

        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "employees/employee-form";
    }
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int Id, Model model){
        //get the employee from the service
        Employee employee=employeeService.findById(Id);
        //set employee in the model to prepopulate the form
        model.addAttribute("employee",employee);
        //save over to our form
        return "employees/employee-form";

    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
    //save the employee
        employeeService.save(employee);
        //use a redirect to prevent duplicate submission
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int id){
        //delete the employee
        employeeService.deleteById(id);
        //redirect to the /employees/list
        return "redirect:/employees/list";
    }

}
