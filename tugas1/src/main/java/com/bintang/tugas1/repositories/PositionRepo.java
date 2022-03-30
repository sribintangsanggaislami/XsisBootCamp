package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.Position;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepo extends JpaRepository <Position, Long> {
    List<Position> findByisDelete (Boolean isDelete);
    
}