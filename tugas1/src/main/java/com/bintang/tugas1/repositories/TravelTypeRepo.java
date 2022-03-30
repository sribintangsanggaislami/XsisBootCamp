package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.TravelType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelTypeRepo extends JpaRepository <TravelType, Long> {
    List<TravelType> findByIsDelete(Boolean isDelete);
    
}

