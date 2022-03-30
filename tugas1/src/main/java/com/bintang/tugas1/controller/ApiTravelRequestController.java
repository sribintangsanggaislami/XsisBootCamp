package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.TravelRequest;
import com.bintang.tugas1.repositories.TravelRequestRepo;

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
public class ApiTravelRequestController {
    @Autowired
    private TravelRequestRepo travelRequestRepo;

    //menampilkan semua data 
    @GetMapping("/travelRequest")
    public ResponseEntity<List<TravelRequest>> GetAllTravelRequest(){
        try{
            List<TravelRequest> travelRequest = this.travelRequestRepo.findByisDelete(false);
            return new ResponseEntity<>(travelRequest, HttpStatus.OK);   
        }catch(Exception exception){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @PostMapping("/travelRequest")
    public ResponseEntity<Object> SaveTravelRequest(@RequestBody TravelRequest travelRequest){
        try{
            travelRequest.setCreatedBy("Bintang");
            travelRequest.setCreatedOn(new Date());
            this.travelRequestRepo.save(travelRequest);
            return new ResponseEntity<>("Berhasil",HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Gagal", HttpStatus.BAD_REQUEST);
        }
    }
    
    @PutMapping("/travelRequest/{id}")
    public ResponseEntity<List<TravelRequest>> UpdateTravelRequest(@RequestBody TravelRequest travelRequest, @PathVariable("id") Long id) {
        Optional<TravelRequest> travelRequestData = this.travelRequestRepo.findById(id);
        if (travelRequestData.isPresent()) {
            travelRequestData.get().setStartDate(travelRequest.getStartDate());
            travelRequestData.get().setEndDate(travelRequest.getEndDate());
            travelRequestData.get().setModifiedBy("Bintang Update");
            travelRequestData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.travelRequestRepo.save(travelRequestData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/travelRequest/{id}")
    public ResponseEntity<HttpStatus> DeleteTravelType(@PathVariable("id") Long id){
        Optional<TravelRequest> travelRequestData = this.travelRequestRepo.findById(id);
        try{
            if(travelRequestData.isPresent()){
                travelRequestData.get().setIsDelete(true);
                this.travelRequestRepo.save(travelRequestData.get());
            }else{
                return ResponseEntity.notFound().build();
            }
            //travelTypeRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }          

        catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    
    }  
}
