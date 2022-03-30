package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.LeaveRequest;
import com.bintang.tugas1.repositories.LeaveRequestRepo;

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
public class ApiLeaveRequestController {
    @Autowired
    private LeaveRequestRepo leaveRequestRepo;

    //menampilkan semua data
    @GetMapping("/leaveRequest")
    public ResponseEntity<List<LeaveRequest>> GetAllLeaveRequest(){
        try{
            List<LeaveRequest> leaverequest = this.leaveRequestRepo.findByIsDelete(false);
            return new ResponseEntity<>(leaverequest, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    //menyimpan sebuah data baru
    @PostMapping("/leaveRequest")
    public ResponseEntity<Object> SaveLeaveRequest (@RequestBody LeaveRequest leaveRequest){
        try{
            leaveRequest.setCreatedBy("Bintang");
            leaveRequest.setCreatedOn(new Date());
            this.leaveRequestRepo.save(leaveRequest);
            return new ResponseEntity<>("Berhasil",HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Salah", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/leaveRequest/{id}")
    public ResponseEntity<List<LeaveRequest>> UpdateleaveRequest(@RequestBody LeaveRequest leaveRequest, @PathVariable("id") Long id) {
        Optional<LeaveRequest> leaveRequestData = this.leaveRequestRepo.findById(id);
        if (leaveRequestData.isPresent()) {
            leaveRequestData.get().setStartDate(leaveRequest.getStartDate());
            leaveRequestData.get().setEndDate(leaveRequest.getEndDate());
            leaveRequestData.get().setModifiedBy("Bintang Update");
            leaveRequestData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.leaveRequestRepo.save(leaveRequestData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/leaveRequest/{id}")
    public ResponseEntity<HttpStatus> DeleteLeaveRequest(@PathVariable("id") Long id){
        Optional<LeaveRequest> leaveRequestData = this.leaveRequestRepo.findById(id);
        try{
            if(leaveRequestData.isPresent()){
                leaveRequestData.get().setIsDelete(true);
                this.leaveRequestRepo.save(leaveRequestData.get());
            }else{
                return ResponseEntity.notFound().build();
            }
            //leaveRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }          

        catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    
    }  
}