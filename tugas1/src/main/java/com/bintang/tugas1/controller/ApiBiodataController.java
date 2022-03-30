package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.bintang.tugas1.models.Biodata;
import com.bintang.tugas1.repositories.BiodataRepo;

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
public class ApiBiodataController {
    @Autowired
    private BiodataRepo biodataRepo;
    //menampilkan semua data

    @GetMapping("/biodata")
    public ResponseEntity<List<Biodata>> GetAllBiodata(){
        try{
            List<Biodata> biodata =  this.biodataRepo.findByIsDelete(false);
            return new ResponseEntity<>(biodata, HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

     // Meyimpan sebuah data baru
     @PostMapping("/biodata")
     public ResponseEntity<Object> SaveBiodata(@Valid @RequestBody Biodata biodata){
         try {
             biodata.setCreatedBy("Bintang Create");
             biodata.setCreatedOn(new Date());
             this.biodataRepo.save(biodata);
             return new ResponseEntity<>("Berhasil", HttpStatus.OK);
         } catch (Exception exception) {
             System.out.println("Error : " + exception.getMessage());
             return new ResponseEntity<>("Salah", HttpStatus.BAD_REQUEST);
         }
     }
     @SuppressWarnings({"unchecked","rawtypes"})
     @PutMapping("/biodata/{id}")
    public ResponseEntity<List<Biodata>> UpdateBiodata(@Valid@RequestBody Biodata biodata, @PathVariable("id") Long id) {
        Optional<Biodata> biodataData = this.biodataRepo.findById(id);
        if (biodataData.isPresent()) {
            biodataData.get().setFirstName(biodata.getFirstName());
            biodataData.get().setLastName(biodata.getLastName());
            biodataData.get().setDob(biodata.getDob());
            biodataData.get().setPob(biodata.getPob());
            biodataData.get().setAddress(biodata.getAddress());
            biodataData.get().setMaritalStatus(biodata.getMaritalStatus());
            biodataData.get().setModifiedBy("Bintang Update");
            biodataData.get().setModifiedOn(new Date());
//            biodata.setId(id);
            this.biodataRepo.save(biodataData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/biodata/{id}")
    public ResponseEntity<HttpStatus> DeleteBiodata(@PathVariable("id") Long id) {
        Optional<Biodata> biodataData = this.biodataRepo.findById(id);
        try {
            if(biodataData.isPresent()){
                biodataData.get().setIsDelete(true);
                this.biodataRepo.save(biodataData.get());
            } else {
                return ResponseEntity.notFound().build();
            }
//            biodataRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}