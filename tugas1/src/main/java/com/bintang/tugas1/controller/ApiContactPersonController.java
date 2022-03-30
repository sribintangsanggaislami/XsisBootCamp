package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.ContactPerson;
import com.bintang.tugas1.repositories.ContactPersonRepo;

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
public class ApiContactPersonController {
    @Autowired
    private ContactPersonRepo contactPersonRepo;

    //menampilkan semua data
    @GetMapping("/contactPerson")
    public ResponseEntity<List<ContactPerson>> GetAllContactPerson(){
        try{
            List<ContactPerson> contactPerson = this.contactPersonRepo.findByIsDelete(false);
            return new ResponseEntity<>(contactPerson, HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    // Meyimpan sebuah data baru
    @PostMapping("/contactPerson")
    public ResponseEntity<Object> SaveContactPerson(@RequestBody ContactPerson contactPerson){
        try {
            contactPerson.setCreatedBy("Bintang");
            contactPerson.setCreatedOn(new Date());
            this.contactPersonRepo.save(contactPerson);
            return new ResponseEntity<>("SUCCES", HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/contactPerson/{id}")
    public ResponseEntity<List<ContactPerson>> UpdateEmployee(@RequestBody ContactPerson contactPerson, @PathVariable("id") Long id) {
        Optional<ContactPerson> contactPersonData = this.contactPersonRepo.findById(id);
        if (contactPersonData.isPresent()) {
            contactPersonData.get().setType(contactPerson.getType());
            contactPersonData.get().setContact(contactPerson.getContact());
            contactPersonData.get().setModifiedBy("Bintang Update");
            contactPersonData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.contactPersonRepo.save(contactPersonData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/contactPerson/{id}")
    public ResponseEntity<HttpStatus> DeleteContactPerson(@PathVariable("id") Long id) {
        Optional<ContactPerson> contactPersonData = this.contactPersonRepo.findById(id);
        try {
            if(contactPersonData.isPresent()){
                contactPersonData.get().setIsDelete(true);
                this.contactPersonRepo.save(contactPersonData.get());
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
