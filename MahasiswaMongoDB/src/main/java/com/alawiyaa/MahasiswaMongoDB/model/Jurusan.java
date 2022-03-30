package com.alawiyaa.MahasiswaMongoDB.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "Jurusan")
public class Jurusan extends CommondEntity {
    @Id
    private String id;
    private String nama;
    private String deskripsi;

    @DBRef
    private List<Fakultas> fakultas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public List<Fakultas> getFakultas() {
        return fakultas;
    }

    public void setFakultas(List<Fakultas> fakultas) {
        this.fakultas = fakultas;
    }


    

    
}
