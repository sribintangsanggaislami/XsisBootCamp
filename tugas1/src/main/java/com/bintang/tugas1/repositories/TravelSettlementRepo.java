package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.TravelSettlement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelSettlementRepo extends JpaRepository <TravelSettlement, Long> {
    List<TravelSettlement> findByIsDelete(Boolean IsDelete);
}
