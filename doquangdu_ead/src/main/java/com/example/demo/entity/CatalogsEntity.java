package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "catalog")
public class CatalogsEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;

    @Column (name = "publishername")
    private  String publishername;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Column (name = "address")
    private  String address;


    @Column (name = "contactperson")
    private  String contactperson;

    @Column (name = "phonenumber")
    private  String phonenumber;


}
