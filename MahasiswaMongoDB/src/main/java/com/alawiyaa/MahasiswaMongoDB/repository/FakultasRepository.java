package com.alawiyaa.MahasiswaMongoDB.repository;

import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Fakultas;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FakultasRepository extends MongoRepository<Fakultas,String> {
    List<Fakultas> findByisDelete(Boolean isDelete);

}
