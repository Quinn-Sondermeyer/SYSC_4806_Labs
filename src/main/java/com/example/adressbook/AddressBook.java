package com.example.adressbook;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook{


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> book;

    /**
     * Default Constructor
     */
    public AddressBook() {book = new ArrayList<BuddyInfo>();}

//    /**
//     * Constructor
//     * @param name
//     */
//    public AddressBook(String name) {
//        book = new ArrayList<BuddyInfo>();
//        this.name = name;
//    }



    /**
     * Adds a person to the List of Buddys
     */
    public void addBuddy(BuddyInfo bud) {
        book.add(bud);
    }
    /**
     * removes a person to the List of Buddys
     */
    public void removeBuddy(BuddyInfo bud) {
        book.remove(bud);
    }

//    public void printAdressBook(){
//        for (BuddyInfo b : book){
//            System.out.println("Name: " + b.getName() + "Phone-Number: " + b.getPhone() + "Address: " + b.getAddress());
//        }
//    }

//    @Override
//    public String toString() {
//        StringBuilder temp = new StringBuilder("");
//        for (BuddyInfo b : book){
//            temp.append(b.toString() + "\n");
//        }
//        String Adressbook = temp.toString();
//        return String.format(
//                "AdressBook[id=%d, temp='%s']",
//                id, Adressbook);
//    }

    /*
        Getters and setters
     */


    public List<BuddyInfo> getBook() {
        return book;
    }

    public void setBook(List<BuddyInfo> book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
