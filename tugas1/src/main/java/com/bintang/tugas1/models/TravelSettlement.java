package com.bintang.tugas1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TravelSettlement")
public class TravelSettlement extends CommonEntity {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_cost")
    private Integer itemCost;

    @Column(name = "travel_request_id")
    private Long travelRequestId;

    @ManyToOne
    @JoinColumn(name = "travel_request_id", insertable = false, updatable = false)
    public TravelRequest travelRequest;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemCost() {
        return itemCost;
    }

    public void setItemCost(Integer itemCost) {
        this.itemCost = itemCost;
    }

    public Long getTravelRequestId() {
        return travelRequestId;
    }

    public void setTravelRequestId(Long travelRequestId) {
        this.travelRequestId = travelRequestId;
    }

    public TravelRequest getTravelRequest() {
        return travelRequest;
    }

    public void setTravelRequest(TravelRequest travelRequest) {
        this.travelRequest = travelRequest;
    }

    
    
}
