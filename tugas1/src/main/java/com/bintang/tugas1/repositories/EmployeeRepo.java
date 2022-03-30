package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    List<Employee> findByIsDelete(Boolean isDelete);
}
