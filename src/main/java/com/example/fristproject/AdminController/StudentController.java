package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {
    private final HashMap<Integer, Student> studentMap = new HashMap<>();

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student) {
        studentMap.put(student.getId(), student);
        return "Student added Successfully";
    }

    @GetMapping("/get_student")
    public List<Student> getstudent() {
        return new ArrayList<>(studentMap.values());
    }
}
