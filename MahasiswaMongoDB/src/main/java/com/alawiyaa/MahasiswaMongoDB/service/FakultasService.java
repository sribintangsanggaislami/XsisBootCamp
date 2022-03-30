package com.alawiyaa.MahasiswaMongoDB.service;

import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Fakultas;
import com.alawiyaa.MahasiswaMongoDB.repository.FakultasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FakultasService {
    
    @Autowired
	private FakultasRepository fakultasRepo;
	
	public List<Fakultas>getAllFakultas(){
		return fakultasRepo.findAll();
	}
    public void simpanFakultas(Fakultas fakultas) {
        fakultasRepo.save(fakultas);
    
   }
   
}
