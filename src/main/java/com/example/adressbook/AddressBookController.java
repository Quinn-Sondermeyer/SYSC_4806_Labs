package com.example.adressbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddressBookController {
    private BuddyInfoRepository buddyInfoRepository;
    @GetMapping("/addressBook")
    public String adressBookForm(Model model) {

        model.addAttribute("addressBook", new AddressBook());
//        model.addAttribute("book", addressBook.getBook());

        return "addressBook";
    }

    @PostMapping("/addressBook")
    public String adressBookSubmit(@ModelAttribute AddressBook addressbook, Model model) {

        model.addAttribute("AddressBook", addressbook);
//        model.addAttribute("book", addressBook.getBook());

        return "result";
    }

}
