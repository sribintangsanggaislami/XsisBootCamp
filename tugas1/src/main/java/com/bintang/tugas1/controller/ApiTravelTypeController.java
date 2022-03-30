package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.TravelType;
import com.bintang.tugas1.repositories.TravelTypeRepo;

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
public class ApiTravelTypeController  {
    @Autowired
    private TravelTypeRepo travelTypeRepo;

    //menampilkan semua data
    @GetMapping("/travelType")
    public ResponseEntity<List<TravelType>> GetAllTravelType(){
        try{
            List<TravelType> travelType = this.travelTypeRepo.findByIsDelete(false);
            return new ResponseEntity<>(travelType, HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    //Menyimpan Sebuah data Baru
    @PostMapping("/travelType")
    public ResponseEntity<Object> SaveTravelType(@RequestBody TravelType travelType){
        try{
            travelType.setCreatedBy("Bintang");
            travelType.setCreatedOn(new Date());
            this.travelTypeRepo.save(travelType);
            return new ResponseEntity<>("Berhasil",HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Gagal", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/travelType/{id}")
    public ResponseEntity<List<TravelType>> UpdateTravelType(@RequestBody TravelType travelType, @PathVariable("id") Long id) {
        Optional<TravelType> travelTypeData = this.travelTypeRepo.findById(id);
        if (travelTypeData.isPresent()) {
            travelTypeData.get().setTravelName(travelType.getTravelName());
            travelTypeData.get().setTravelFee(travelType.getTravelFee());
            travelTypeData.get().setModifiedBy("Bintang Update");
            travelTypeData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.travelTypeRepo.save(travelTypeData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/travelType/{id}")
    public ResponseEntity<HttpStatus> DeleteTravelType(@PathVariable("id") Long id){
        Optional<TravelType> travelTypeData = this.travelTypeRepo.findById(id);
        try{
            if(travelTypeData.isPresent()){
                travelTypeData.get().setIsDelete(true);
                this.travelTypeRepo.save(travelTypeData.get());
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
