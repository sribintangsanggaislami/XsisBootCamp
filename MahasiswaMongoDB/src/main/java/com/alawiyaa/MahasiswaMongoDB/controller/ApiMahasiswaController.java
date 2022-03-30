package com.alawiyaa.MahasiswaMongoDB.controller;

import java.util.Date;
import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Mahasiswa;
import com.alawiyaa.MahasiswaMongoDB.service.MahasiswaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiMahasiswaController {
    @Autowired
	private MahasiswaService mhsService;

	@GetMapping("mahasiswa")
	public List<Mahasiswa>getall(){
		return mhsService.getall();
	}
    @PostMapping("mahasiswa")
	public void simpan(@RequestBody Mahasiswa mahasiswa){
         mahasiswa.setCreateBy("Bintang");
         mahasiswa.setCreatedOn(new Date());
         mhsService.simpanMahasiswa(mahasiswa);

	}

}
