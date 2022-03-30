package com.alawiyaa.MahasiswaMongoDB.service;

import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Jurusan;
import com.alawiyaa.MahasiswaMongoDB.repository.JurusanRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class JurusanService {
    
    @Autowired
	private JurusanRepository jurusanRepo;
	
	public List<Jurusan>getall(){
		return jurusanRepo.findAll();
	}
    public void simpanJurusan(Jurusan jurusan) {
        jurusanRepo.save(jurusan);
    
   }
}
