package com.alawiyaa.MahasiswaMongoDB.repository;

import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Mahasiswa;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MahasiswaRepository extends MongoRepository<Mahasiswa,String> {
    List<Mahasiswa> findByisDelete(Boolean isDelete);
}
