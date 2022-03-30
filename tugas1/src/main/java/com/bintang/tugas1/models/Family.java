package com.bintang.tugas1.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Family")
public class Family extends CommonEntity {
    @Id
    @Column(name ="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="status")
    private String status;

    @Column(name="biodata_id")
    private Long biodataId;

    @ManyToOne
    @JoinColumn(name = "biodata_id" , insertable = false, updatable = false)
    public Biodata biodata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getBiodataId() {
        return biodataId;
    }

    public void setBiodataId(Long biodataId) {
        this.biodataId = biodataId;
    }

    public Biodata getBiodata() {
        return biodata;
    }

    public void setBiodata(Biodata biodata) {
        this.biodata = biodata;
    }

    
}

