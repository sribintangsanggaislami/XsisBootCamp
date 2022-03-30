package com.alawiyaa.MahasiswaMongoDB.controller;

import java.util.Date;
import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Jurusan;
import com.alawiyaa.MahasiswaMongoDB.service.JurusanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiJurusanController {
    @Autowired
	private JurusanService jurusanService;

	@GetMapping("jurusan")
	public List<Jurusan>getall(){
		return jurusanService.getall();
	}
    @PostMapping("jurusan")
	public void simpan(@RequestBody Jurusan jurusan){
         jurusan.setCreateBy("Bintang");
         jurusan.setCreatedOn(new Date());
         jurusanService.simpanJurusan(jurusan);

	}

 
	
	
}
