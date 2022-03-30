package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.EmployeePosition;
import com.bintang.tugas1.repositories.EmployeePositionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ApiEmployeePositionController {
    @Autowired
    private EmployeePositionRepo employeePositionRepo; 
    
    //menampilkan semua data
    @GetMapping("/employeePosition")
    public ResponseEntity<List<EmployeePosition>> GetAllEmployeePosition(){
        try{
            List<EmployeePosition> employeePosition = this.employeePositionRepo.findByIsDelete(false);
            return new ResponseEntity<>(employeePosition, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
     // Meyimpan sebuah data baru
     @PostMapping("/employeePosition")
     public ResponseEntity<Object> Saveleave(@RequestBody EmployeePosition employeePosition){
         try {
            employeePosition.setCreatedBy("Bintang Create");
            employeePosition.setCreatedOn(new Date());
             this.employeePositionRepo.save(employeePosition);
             return new ResponseEntity<>("Berhasil", HttpStatus.OK);
         } catch (Exception exception) {
             System.out.println("Error : " + exception.getMessage());
             return new ResponseEntity<>("Salah", HttpStatus.BAD_REQUEST);
         }
     }

     @DeleteMapping("/employeePosition/{id}")
    public ResponseEntity<HttpStatus> DeleteemployeePosition(@PathVariable("id") Long id) {
        Optional<EmployeePosition> employeePositionData = this.employeePositionRepo.findById(id);
        try {
            if(employeePositionData.isPresent()){
                employeePositionData.get().setIsDelete(true);
                this.employeePositionRepo.save(employeePositionData.get());
            } else {
                return ResponseEntity.notFound().build();
            }
//            leaveRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
