package com.alawiyaa.MahasiswaMongoDB.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "Mahasiswa")
public class Mahasiswa extends CommondEntity {
    @Id
    private String id;
    private String nama;
    private String email;
    private String noHp;
    private String alamat;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)

    private String dob;
    private String pob;

    @DBRef
    private List<Jurusan> jurusan;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNoHp() {
        return noHp;
    }
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getPob() {
        return pob;
    }
    public void setPob(String pob) {
        this.pob = pob;
    }
    public List<Jurusan> getJurusan() {
        return jurusan;
    }
    public void setJurusan(List<Jurusan> jurusan) {
        this.jurusan = jurusan;
    }
    public List<Fakultas> getFakultas() {
        return fakultas;
    }
    public void setFakultas(List<Fakultas> fakultas) {
        this.fakultas = fakultas;
    }

    
}
