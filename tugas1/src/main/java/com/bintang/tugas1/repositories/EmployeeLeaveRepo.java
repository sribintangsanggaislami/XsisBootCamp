package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.EmployeeLeave;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeLeaveRepo extends JpaRepository<EmployeeLeave, Long> {
    List<EmployeeLeave> findByIsDelete(Boolean isDelete);

}

