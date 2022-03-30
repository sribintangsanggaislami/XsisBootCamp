package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.TravelRequest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRequestRepo extends JpaRepository <TravelRequest, Long> {
    List<TravelRequest> findByisDelete (Boolean isDelete);
    
}