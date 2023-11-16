package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Admin;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("Admin")
class AdminController {
    private final HashMap<Integer, Admin> adminMap = new HashMap<>();

    @PostMapping("/add_admin")
    public String addAdmin(@RequestBody Admin admin) {
        adminMap.put(admin.getId(), admin);
        return "Admin added Successfully";
    }

    @GetMapping("/get_admin")
    public List<Admin> getAdmin() {
        return new ArrayList<>(adminMap.values());
        /*
        List<Admin> ans = new ArrayList<>();
         for(int adminId : adminMap.keySet()){
         ans.add(adminMap.get(adminId));
         }
         return ans;
         */

    }
}
