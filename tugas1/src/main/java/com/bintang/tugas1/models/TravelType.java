package com.bintang.tugas1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TravelType")
public class TravelType extends CommonEntity {
    @Id
    @Column(name = "travel_type_id")
    private Long travelTypeId;

    @Column(name = "tavel_name")
    private String travelName;

    @Column(name = "travel_fee")
    private Integer travelFee;

    public Long getTravelTypeId() {
        return travelTypeId;
    }

    public void setTravelTypeId(Long travelTypeId) {
        this.travelTypeId = travelTypeId;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName;
    }

    public Integer getTravelFee() {
        return travelFee;
    }

    public void setTravelFee(Integer travelFee) {
        this.travelFee = travelFee;
    }



}
