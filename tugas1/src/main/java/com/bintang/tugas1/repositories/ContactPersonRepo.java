package com.bintang.tugas1.repositories;

import java.util.List;

import com.bintang.tugas1.models.ContactPerson;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactPersonRepo extends JpaRepository<ContactPerson, Long> {
    List<ContactPerson> findByIsDelete(Boolean isDelete);

}
