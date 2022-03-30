package com.bintang.tugas1.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "biodata")
public class Biodata extends CommonEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "Id")
	private Long id;
	
	@NotEmpty(message = "Must not empty!")
	@Pattern(regexp= "^[a-zA-z]*$", message = "Must be alphabetical")
	@Size(min=1, max=20)
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty(message = "Must not empty")
	@Size(min=1, max=30)
	@Column(name = "last_name")
	private String lastName;
	
	@NotEmpty(message = "Must not empty!")
	@Size(min=10,max=10, message = "dd-mm-yyyy")
    @Column(name = "dob")
    // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dob;

	@NotEmpty(message = "Must not empty!")
	@Size(min=1,max=50)
    @Column(name = "pob")
    private String pob;

	
	@NotEmpty(message = "Must not empty!")
    @Size(min=1,max=255)
    @Column(name = "address")
    private String address;
    
//	@NotBlank(message = "Must not blank!")
    @Column(name = "marital_status")
    private Boolean maritalStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim().replaceAll("\\s+", " ");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
		this.lastName = lastName.trim();
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
		this.pob = pob.trim().replaceAll("\\s+", " ");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
		this.address = address.trim().replaceAll("\\s+", " ");
    }

    public Boolean getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

}
