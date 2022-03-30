package com.bintang.tugas1.repositories;
import java.util.List;

import com.bintang.tugas1.models.LeaveRequest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepo extends JpaRepository <LeaveRequest,Long>{
    List<LeaveRequest> findByIsDelete(Boolean isDelete);

 
}

