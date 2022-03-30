package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.Leave;
import com.bintang.tugas1.repositories.LeaveRepo;

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
public class ApiLeaveController {
    @Autowired
    private LeaveRepo leaveRepo;

    //menampilkan semua data
    @GetMapping("/leave")
    public ResponseEntity<List<Leave>> GetAllLeave(){
        try{
            List<Leave> leave = this.leaveRepo.findByIsDelete(false);
            return new ResponseEntity<>(leave, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
     // Meyimpan sebuah data baru
     @PostMapping("/leave")
     public ResponseEntity<Object> Saveleave(@RequestBody Leave leave){
         try {
             leave.setCreatedBy("Bintang Create");
             leave.setCreatedOn(new Date());
             this.leaveRepo.save(leave);
             return new ResponseEntity<>("Berhasil", HttpStatus.OK);
         } catch (Exception exception) {
             System.out.println("Error : " + exception.getMessage());
             return new ResponseEntity<>("Salah", HttpStatus.BAD_REQUEST);
         }
     }

     @PutMapping("/leave/{id}")
    public ResponseEntity<List<Leave>> UpdateEmployee(@RequestBody Leave leave, @PathVariable("id") Long id) {
        Optional<Leave> leaveData = this.leaveRepo.findById(id);
        if (leaveData.isPresent()) {
            leaveData.get().setType(leave.getType());
            leaveData.get().setName(leave.getName());
            leaveData.get().setModifiedBy("Bintang Update");
            leaveData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.leaveRepo.save(leaveData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }

     @DeleteMapping("/leave/{id}")
    public ResponseEntity<HttpStatus> DeleteLeave(@PathVariable("id") Long id) {
        Optional<Leave> leaveData = this.leaveRepo.findById(id);
        try {
            if(leaveData.isPresent()){
                leaveData.get().setIsDelete(true);
                this.leaveRepo.save(leaveData.get());
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
