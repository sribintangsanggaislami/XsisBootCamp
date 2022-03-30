package com.bintang.tugas1.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Contact_Person")
public class ContactPerson extends CommonEntity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String Type;

    @Column(name = "contact")
    private String Contact;

    @Column(name="biodata_id")
    private long BiodataId;

    @ManyToOne
    @JoinColumn(name = "biodata_id", insertable = false, updatable = false)
    public Biodata biodata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
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
