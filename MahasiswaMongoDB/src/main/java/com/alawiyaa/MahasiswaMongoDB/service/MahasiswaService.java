package com.alawiyaa.MahasiswaMongoDB.service;

import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Mahasiswa;
import com.alawiyaa.MahasiswaMongoDB.repository.MahasiswaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MahasiswaService {
    @Autowired
	private MahasiswaRepository mhsRepo;
	
	public List<Mahasiswa>getall(){
		return mhsRepo.findAll();
	}
    public void simpanMahasiswa(Mahasiswa mahasiswa) {
        mhsRepo.save(mahasiswa);
    
   }
}
