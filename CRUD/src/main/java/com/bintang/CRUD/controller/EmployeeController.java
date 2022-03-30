package com.bintang.CRUD.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bintang.CRUD.exception.ResourceNotFoundException;
import com.bintang.CRUD.models.Employee;
import com.bintang.CRUD.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    //get all employee
    @GetMapping("employee")
   public List<Employee>getAllEmployee(){
        return this.employeeRepository.findAll();
    }

    //get employeee id

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value="id") Long employeeId)
        throws ResourceNotFoundException{
            Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found for this id ::"+employeeId));
                return ResponseEntity.ok().body(employee);
        } 
    // save employee

    @PostMapping("employee")
    public Employee createEmployee(@RequestBody Employee employee){
        return this.employeeRepository.save(employee);
    }
    //update employee

    @PutMapping("employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId, @RequestBody Employee employeeDetails)
        throws ResourceNotFoundException{
            Employee employee = employeeRepository.findById(employeeId)
            .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found for this id ::"+employeeId));
            return ResponseEntity.ok().body(employee);
        }

    
     // delete employee
     @DeleteMapping("employee/{id}")
     public Map<String, Boolean> deleteMapping (@PathVariable(value = "id") Long employeeId ) 
     throws ResourceNotFoundException{
         Employee employee = employeeRepository.findById(employeeId)
         .orElseThrow(()-> new ResourceNotFoundException("Emloyee Not Found fot this id ::"+employeeId));
         this.employeeRepository.delete(employee);

         Map<String, Boolean> response = new HashMap<>();
         response.put("deleted", Boolean.TRUE);

         return response;
     }
} 
