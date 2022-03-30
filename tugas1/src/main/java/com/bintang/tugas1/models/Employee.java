package com.bintang.tugas1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee extends CommonEntity{
    
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "nip", nullable = false)
    private String nip;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "salary", nullable = false)
    private Integer salary;

    @Column(name = "biodata_id")
    private long BiodataId;

    @OneToOne
    @JoinColumn(name = "biodata_id", insertable = false, updatable = false)
    public Biodata biodata;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public long getBiodataId() {
        return BiodataId;
    }

    public void setBiodataId(long biodataId) {
        BiodataId = biodataId;
    }

    public Biodata getBiodata() {
        return biodata;
    }

    public void setBiodata(Biodata biodata) {
        this.biodata = biodata;
    }

    

}
