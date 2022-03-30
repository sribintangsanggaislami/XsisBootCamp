package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.TravelSettlement;
import com.bintang.tugas1.repositories.TravelSettlementRepo;

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
@RequestMapping("/TravelSettlement")
public class ApiTravelSettlementController{
    @Autowired
    private TravelSettlementRepo travelSettlementRepo;

    @GetMapping("travelSettlement")
    public ResponseEntity<List<TravelSettlement>> GetAllTravelType(){
        try{
            List<TravelSettlement> travelSettlement = this.travelSettlementRepo.findByIsDelete(false);
            return new ResponseEntity<>(travelSettlement, HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
//Menyimpan Sebuah data Baru
@PostMapping("/travelSettlement")
public ResponseEntity<Object> SavetravelSettlement(@RequestBody TravelSettlement travelSettlement){
    try{
        travelSettlement.setCreatedBy("Bintang");
        travelSettlement.setCreatedOn(new Date());
        this.travelSettlementRepo.save(travelSettlement);
        return new ResponseEntity<>("Berhasil",HttpStatus.OK);
    }catch(Exception exception){
        return new ResponseEntity<>("Gagal", HttpStatus.BAD_REQUEST);
    }
}

@PutMapping("/travelSettlement/{id}")
    public ResponseEntity<List<TravelSettlement>> UpdatetTravelSettlement(@RequestBody TravelSettlement travelSettlement, @PathVariable("id") Long id) {
        Optional<TravelSettlement> travelSettlementData = this.travelSettlementRepo.findById(id);
        if (travelSettlementData.isPresent()) {
            travelSettlementData.get().setItemName(travelSettlement.getItemName());
            travelSettlementData.get().setItemCost(travelSettlement.getItemCost());
            travelSettlementData.get().setModifiedBy("Bintang Update");
            travelSettlementData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.travelSettlementRepo.save(travelSettlementData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
@DeleteMapping("/travelSettlement/{id}")
public ResponseEntity<HttpStatus> DeleteTravelSettlement(@PathVariable("id") Long id){
    Optional<TravelSettlement> travelSettlementData = this.travelSettlementRepo.findById(id);
    try{
        if(travelSettlementData.isPresent()){
            travelSettlementData.get().setIsDelete(true);
            this.travelSettlementRepo.save(travelSettlementData.get());
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
