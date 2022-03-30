package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.Department;
import com.bintang.tugas1.repositories.DepartmentRepo;

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
public class ApiDepartmentController {
    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping("/department")
    public ResponseEntity<List<Department>> GetAllDepartment(){
        try{
            List<Department> department = this.departmentRepo.findByIsDelete(false);
            return new ResponseEntity<>(department, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    // Meyimpan sebuah data baru
    @PostMapping("/department")
    public ResponseEntity<Object> SaveDepartment(@RequestBody Department department){
        try {
            department.setCreatedBy("Bintang");
            department.setCreatedOn(new Date());
            this.departmentRepo.save(department);
            return new ResponseEntity<>("SUCCES", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/department/{id}")
    public ResponseEntity<List<Department>> UpdateDepartment(@RequestBody Department department, @PathVariable("id") Long id) {
        Optional<Department> departmentData = this.departmentRepo.findById(id);
        if (departmentData.isPresent()) {
            departmentData.get().setName(department.getName());
            departmentData.get().setModifiedBy("Bintang Update");
            departmentData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.departmentRepo.save(departmentData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
   
    @DeleteMapping("/department/{id}")
    public ResponseEntity<HttpStatus> DeleteDepartment(@PathVariable("id") Long id) {
        Optional<Department> departmentData = this.departmentRepo.findById(id);
        try {
            if(departmentData.isPresent()){
                departmentData.get().setIsDelete(true);
                this.departmentRepo.save(departmentData.get());
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
