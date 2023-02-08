package com.example.adressbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class AdressBookApplication {
    private static final Logger log = LoggerFactory.getLogger(AdressBookApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(AdressBookApplication.class, args);
    }


    @Bean
    public CommandLineRunner buddyInfoMaker(BuddyInfoRepository repository){
        BuddyInfo b1 = new BuddyInfo("Homer", "420-420-6969", "420 Blaze St.");
        BuddyInfo b2 = new BuddyInfo("Bart", "420-420-6969", "421 Blaze St.");
        BuddyInfo b3 = new BuddyInfo("Lisa", "420-696-4200", "422 Blaze St.");
        BuddyInfo b4 = new BuddyInfo("Marge", "420-420-0420", "423 Blaze St.");
        return (args) -> {
            repository.save(b1);
            repository.save(b2);
            repository.save(b3);
            repository.save(b4);
        };
    }

    @Bean
    public CommandLineRunner addressBookMaker(AddressBookRepository repository){
        ArrayList<BuddyInfo> budyinfos1 = new ArrayList<BuddyInfo>();
        ArrayList<BuddyInfo> budyinfos2 = new ArrayList<BuddyInfo>();
        BuddyInfo b1 = new BuddyInfo("Homer", "420-420-6969", "420 Blaze St.");
        BuddyInfo b2 = new BuddyInfo("Bart", "420-420-6969", "421 Blaze St.");
        BuddyInfo b3 = new BuddyInfo("Lisa", "420-696-4200", "422 Blaze St.");
        BuddyInfo b4 = new BuddyInfo("Marge", "420-420-0420", "423 Blaze St.");
        budyinfos1.add( b1);
        budyinfos1.add( b2);
        budyinfos2.add( b3);
        budyinfos2.add( b4);
        AddressBook adressBook1 = new AddressBook();
        adressBook1.setBook(budyinfos1);
        AddressBook adressBook2 = new AddressBook();
        adressBook2.setBook(budyinfos2);
        return (args) -> {
            repository.save(adressBook1);
            repository.save(adressBook2);
        };
    }


}
