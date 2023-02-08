package com.example.adressbook;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {


    Optional<AddressBook> findById(Long id);


}
