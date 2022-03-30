package com.bintang.tugas1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeePosition")
public class EmployeePosition extends CommonEntity{

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "employee_id")
    private long employeeId;

    @Column(name = "position_id")
    private long positionId;


    @ManyToOne
    @JoinColumn(name="employee_id", insertable = false, updatable = false)
    public Employee employee;
    
    @ManyToOne
    @JoinColumn(name = "position_id", insertable = false, updatable = false)
    public Position position;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    
    
}