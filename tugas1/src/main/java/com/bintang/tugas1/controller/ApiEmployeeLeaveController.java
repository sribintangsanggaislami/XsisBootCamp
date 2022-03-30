package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.EmployeeLeave;
import com.bintang.tugas1.repositories.EmployeeLeaveRepo;

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
public class ApiEmployeeLeaveController {
    @Autowired
    private EmployeeLeaveRepo employeeLeaveRepo;

    //menampilkan semua data
    @GetMapping("/employeeLeave")
    public ResponseEntity<List<EmployeeLeave>> GetAllEmployeeLeave(){
        try{
            List<EmployeeLeave> employeeLeave = this.employeeLeaveRepo.findByIsDelete(false);
            return new ResponseEntity<>(employeeLeave, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }


    @PostMapping("/employeeLeave")
    public ResponseEntity<Object> SaveEmployeeLeave(@RequestBody EmployeeLeave employeeLeave){
        try{
            employeeLeave.setCreatedBy("Bintang");
            employeeLeave.setCreatedOn(new Date());
            this.employeeLeaveRepo.save(employeeLeave);
            return new ResponseEntity<>("Berhasil", HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Salah", HttpStatus.BAD_REQUEST);
        }
    }


    @PutMapping("/employeeLeave/{id}")
    public ResponseEntity<List<EmployeeLeave>> UpdateEmployeeLeave(@RequestBody EmployeeLeave employeeLeave, @PathVariable("id") Long id) {
        Optional<EmployeeLeave> employeeLeaveData = this.employeeLeaveRepo.findById(id);
        if (employeeLeaveData.isPresent()) {
            employeeLeaveData.get().setPeriode(employeeLeave.getPeriod());
            employeeLeaveData.get().setRegulerQuota(employeeLeave.getRegulerQuota());
            employeeLeaveData.get().setModifiedBy("Bintang Update");
            employeeLeaveData.get().setModifiedOn(new Date());

            this.employeeLeaveRepo.save(employeeLeaveData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/employeeLeave/{id}")
    public ResponseEntity<HttpStatus> DeleteEmployeeLeave(@PathVariable("id") Long id){
        Optional<EmployeeLeave> employeeLeaveData = this.employeeLeaveRepo.findById(id);
        try{
            if(employeeLeaveData.isPresent()){
                employeeLeaveData.get().setIsDelete(true);
            }else{
                return ResponseEntity.notFound().build();
            }
            //  leaveRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }catch(Exception exception){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
