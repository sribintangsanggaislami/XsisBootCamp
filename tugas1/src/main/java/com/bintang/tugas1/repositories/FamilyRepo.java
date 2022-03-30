package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.Family;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepo extends JpaRepository<Family,Long>{
    List<Family>    findByIsDelete(Boolean IsDelete);
}