package com.bintang.tugas1.repositories;
import java.util.List;

import com.bintang.tugas1.models.EmployeePosition;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePositionRepo extends JpaRepository<EmployeePosition, Long>{
    List<EmployeePosition> findByIsDelete(Boolean isDelete);
}