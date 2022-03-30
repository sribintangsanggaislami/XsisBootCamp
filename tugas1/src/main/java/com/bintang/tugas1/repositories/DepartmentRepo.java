package com.bintang.tugas1.repositories;


import java.util.List;

import com.bintang.tugas1.models.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository <Department,Long> {
    List<Department> findByIsDelete(Boolean isDelete);
    
}
