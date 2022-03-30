package com.bintang.tugas1.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.bintang.tugas1.models.Position;
import com.bintang.tugas1.repositories.PositionRepo;

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
public class ApiPositionController {
    @Autowired
    private PositionRepo positionRepo;
    //menampilkan semua data 
    @GetMapping("/position")
    public ResponseEntity<List<Position>> GetAllPosition(){
        try{
            List<Position> position = this.positionRepo.findByisDelete(false);
            return new ResponseEntity<>(position, HttpStatus.OK);   
        }catch(Exception exception){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @PostMapping("/position")
    public ResponseEntity<Object> SavePosition(@RequestBody Position position){
        try{
            position.setCreatedBy("Bintang");
            position.setCreatedOn(new Date());
            this.positionRepo.save(position);
            return new ResponseEntity<>("Berhasil",HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity<>("Gagal", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/position/{id}")
    public ResponseEntity<List<Position>> Updateposition(@RequestBody Position position, @PathVariable("id") Long id) {
        Optional<Position> positiontData = this.positionRepo.findById(id);
        if (positiontData.isPresent()) {
            positiontData.get().setName(position.getName());
            positiontData.get().setModifiedBy("Bintang Update");
            positiontData.get().setModifiedOn(new Date());
//            contactPerson.setId(id);
            this.positionRepo.save(positiontData.get());
            ResponseEntity rest = new ResponseEntity<>("success", HttpStatus.OK);
            return rest;
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/position/{id}")
    public ResponseEntity<HttpStatus> DeletePosition(@PathVariable("id") Long id){
        Optional<Position> positionData = this.positionRepo.findById(id);
        try{
            if(positionData.isPresent()){
                positionData.get().setIsDelete(true);
                this.positionRepo.save(positionData.get());
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
