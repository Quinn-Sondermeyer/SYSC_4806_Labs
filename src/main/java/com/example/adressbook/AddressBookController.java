package com.example.adressbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addressBook")
public class AddressBookController {
    private BuddyInfoRepository buddyInfoRepository;
    @GetMapping("/{id}")
    public String adressBook(@RequestParam("id") AddressBook addressBook, Model model) {

        model.addAttribute("id", addressBook.getId());
        model.addAttribute("book", addressBook.getBook());

        return "addressBook";
    }

}
