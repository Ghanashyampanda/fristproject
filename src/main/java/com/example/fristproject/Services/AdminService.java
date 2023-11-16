package com.example.fristproject.Services;

import com.example.fristproject.Exceptions.AdminAlreadyPresent;
import com.example.fristproject.Models.Admin;
import com.example.fristproject.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public void addAdmin(Admin admin) throws AdminAlreadyPresent {
        Optional<Admin> adminOptional = adminRepository.addAdmin(admin);
        if(adminOptional.isEmpty())throw new AdminAlreadyPresent("admin already present");
    }
}
