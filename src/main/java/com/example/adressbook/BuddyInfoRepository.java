package com.example.adressbook;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {

    Optional<BuddyInfo> findById(Long id);
    List<BuddyInfo> findByphone(String phone);
    List<BuddyInfo> findByAddress(String address);
    List<BuddyInfo> findByName(String name);
}
