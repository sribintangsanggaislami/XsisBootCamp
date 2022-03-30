package com.alawiyaa.MahasiswaMongoDB.repository;
import java.util.List;

import com.alawiyaa.MahasiswaMongoDB.model.Jurusan;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface JurusanRepository extends MongoRepository<Jurusan, String> {
    List<Jurusan> findByisDelete(Boolean isDelete);

}
