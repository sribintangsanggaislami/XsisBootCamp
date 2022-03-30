package com.alawiyaa.MahasiswaMongoDB.controller;

import java.util.Date;
import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Fakultas;
import com.alawiyaa.MahasiswaMongoDB.service.FakultasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiFakultasController {

    @Autowired
	private FakultasService fakultasService;

	@GetMapping("fakultas")
	public List<Fakultas>getall(){
		return fakultasService.getAllFakultas();
	}
    @PostMapping("fakultas")
	public void simpan(@RequestBody Fakultas fakultas){
         fakultas.setCreateBy("Bintang");
         fakultas.setCreatedOn(new Date());
         fakultasService.simpanFakultas(fakultas);

	}

    @PutMapping("fakultas/{id}")
	public void ubah(@RequestBody Fakultas fakultas, @PathVariable("id") String id){
         fakultas.setModifiedBy("Bintang");
         fakultasService.simpanFakultas(fakultas);

	}

    @DeleteMapping("fakultas")
	public void hapus(@RequestBody Fakultas fakultas){
         fakultas.setCreateBy("Bintang");
         fakultas.setCreatedOn(new Date());
         fakultasService.simpanFakultas(fakultas);

	}

    
}
