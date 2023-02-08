package com.example.adressbook;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BuddyInfo{



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String phone;
    private String address;

    /**
     * Default Constructor
     */
    public BuddyInfo() {

    }

    /**
     * Constructor
     * @param name
     * @param phone
     * @param address
     */
    public BuddyInfo(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;

    }





    /**
     * Gets a Buddy's Name
     * @return String Name
     */

    public String getName() {
        return name;
    }

    /**
     * Gets a Buddy's Phone number
     * @return String Phone
     */

    public String getPhone() {
        return phone;
    }
    /**
     * Gets a Buddy's Adress
     * @return String Adress
     */

//    @Override
//    public String toString(){
//        return String.format(
//                "Buddy[name=%d, phone='%s', address='%s']",
//                name, phone, address);
//    }


    public String getAddress() {
        return address;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
