package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.Employee;
import com.bintang.tugas1.repositories.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")

public class ApiEmployeeController {
    @Autowired
    private EmployeeRepo employeeRepo;

    //menampilkan semua data
    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> GetAllEmployee(){
        try{
            List<Employee> employee = this.employeeRepo.findByIsDelete(false);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    // Meyimpan sebuah data baru
    @PostMapping("/employee")
    public ResponseEntity<Object> SaveEmployee(@RequestBody Employee employee){
        try {
            employee.setCreatedBy("Bintang");
            employee.setCreatedOn(new Date());
            this.employeeRepo.save(employee);
            return new ResponseEntity<>("SUCCES", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
        }
    }
   
    @PutMapping("/employee/{id}")
    public ResponseEntity<List<Employee>> UpdateEmployee(@RequestBody Employee employee, @PathVariable("id") Long id) {
        Optional<Employee> employeeData = this.employeeRepo.findById(id);
        if (employeeData.isPresent()) {
            employeeData.get().setNip(employee.getNip());
            employeeData.get().setStatus(employee.getStatus());
            employeeData.get().setSalary(employee.getSalary());
            // employeeData.get().setBiodata(employee.getBiodata());
            employeeData.get().setModifiedBy("Bintang Update");
            employeeData.get().setModifiedOn(new Date());
//            employee.setId(id);
            this.employeeRepo.save(employeeData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<HttpStatus> DeleteEmployee(@PathVariable("id") Long id) {
        Optional<Employee> employeeData = this.employeeRepo.findById(id);
        try {
            if(employeeData.isPresent()){
                employeeData.get().setIsDelete(true);
                this.employeeRepo.save(employeeData.get());
            } else {
                return ResponseEntity.notFound().build();
            }
//            employeeRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
