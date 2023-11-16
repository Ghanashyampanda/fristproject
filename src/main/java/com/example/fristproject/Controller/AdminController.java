package com.example.fristproject.Controller;

import com.example.fristproject.Exceptions.AdminAlreadyPresent;
import com.example.fristproject.Models.Admin;
import com.example.fristproject.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("Admin")
class AdminController
{
    @Autowired
    AdminService adminService;
    @PostMapping("/add_admin")
    public ResponseEntity<String> addAdmin(@RequestBody Admin admin){
        try {
            adminService.addAdmin(admin);
            return new ResponseEntity<>("addmin added successfully", HttpStatus.CREATED);
        }catch (AdminAlreadyPresent e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}