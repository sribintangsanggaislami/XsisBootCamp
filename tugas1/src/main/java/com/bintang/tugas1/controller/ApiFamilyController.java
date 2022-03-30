package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.Family;
import com.bintang.tugas1.repositories.FamilyRepo;

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
public class ApiFamilyController {
    @Autowired
    private FamilyRepo familyRepo;
    
    @GetMapping("/family")
    public ResponseEntity<List<Family>> GetAllFamily(){
        try{
            List<Family> family = this.familyRepo.findByIsDelete(false);
            return new ResponseEntity<>(family, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
     // Meyimpan sebuah data baru
     @PostMapping("/family")
     public ResponseEntity<Object> Savefamily(@RequestBody Family family){
         try {
            family.setCreatedBy("Bintang Create");
            family.setCreatedOn(new Date());
             this.familyRepo.save(family);
             return new ResponseEntity<>("Berhasil", HttpStatus.OK);
         } catch (Exception exception) {
             System.out.println("Error : " + exception.getMessage());
             return new ResponseEntity<>("Salah", HttpStatus.BAD_REQUEST);
         }
     }
     @PutMapping("/family/{id}")
    public ResponseEntity<List<Family>> UpdateFamily(@RequestBody Family family, @PathVariable("id") Long id) {
        Optional<Family> familyData = this.familyRepo.findById(id);
        if (familyData.isPresent()) {
            familyData.get().setName(family.getName());
            familyData.get().setModifiedBy("Bintang Update");
            familyData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.familyRepo.save(familyData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }

     @DeleteMapping("/family/{id}")
    public ResponseEntity<HttpStatus> DeleteFamily(@PathVariable("id") Long id) {
        Optional<Family> familyData = this.familyRepo.findById(id);
        try {
            if(familyData.isPresent()){
                familyData.get().setIsDelete(true);
                this.familyRepo.save(familyData.get());
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
