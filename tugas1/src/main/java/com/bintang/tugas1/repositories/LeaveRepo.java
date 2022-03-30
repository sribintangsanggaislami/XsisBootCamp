package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.Leave;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepo extends JpaRepository<Leave,Long> {
    List<Leave> findByIsDelete(Boolean isDelete);
}

