package com.bintang.tugas1.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TravelRequest")
public class TravelRequest extends CommonEntity {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "start_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @Column(name = "end_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    @Column(name = "employee_id")
    private long employeeId;

    @Column(name = "travel_type_id")
    private long travelTypeId;


    @ManyToOne
    @JoinColumn(name ="employee_id" , insertable = false, updatable = false)
    public Employee employee; 
    
    @ManyToOne
    @JoinColumn(name = "travel_type_id" , insertable =false, updatable = false)
    public TravelType travelType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getTravelTypeId() {
        return travelTypeId;
    }

    public void setTravelTypeId(long travelTypeId) {
        this.travelTypeId = travelTypeId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

   
}
