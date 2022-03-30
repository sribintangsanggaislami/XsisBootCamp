package com.bintang.tugas1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeLeave")
public class EmployeeLeave extends CommonEntity{
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "period", nullable = false)
    private String period;

    @Column(name = "reguler_quota", nullable = false)
    private Integer regulerQuota;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    public Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriode(String period) {
        this.period = period;
    }

    public Integer getRegulerQuota() {
        return regulerQuota;
    }

    public void setRegulerQuota(Integer regulerQuota) {
        this.regulerQuota = regulerQuota;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
