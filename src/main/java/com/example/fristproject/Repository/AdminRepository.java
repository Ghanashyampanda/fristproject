package com.example.fristproject.Repository;

import com.example.fristproject.Exceptions.AdminAlreadyPresent;
import com.example.fristproject.Models.Admin;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;
@Repository
public class AdminRepository {
    private HashMap<Integer, Admin> adminMap = new HashMap<>();
    public Optional<Admin> addAdmin(Admin admin){
        if(!adminMap.containsKey(admin.getId())){
            adminMap.put(admin.getId(), admin);
            return Optional.of(admin);
        }
        return Optional.empty();
    }
}
