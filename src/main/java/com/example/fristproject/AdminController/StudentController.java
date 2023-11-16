package com.example.fristproject.AdminController;

import com.example.fristproject.Models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/student")
public class StudentController {
   HashMap<Integer, Student> studentMap = new HashMap<>();

    @PostMapping("/add_student")
    public String addStudent(@RequestBody Student student) {
        studentMap.put(student.getRoll(), student);
        return "Student added Successfully";
    }
    @DeleteMapping("/remove_student")
    public String removeStudentById(@RequestParam int id){
        if(studentMap.containsKey(id)) {
            studentMap.remove(id);
            return "student deleted successfully";
        }else{
            return "student not found";
        }
    }
    @PutMapping("update-studentName")
    public String updateStudentName(@RequestParam int roll, @RequestParam String Name){
        Student student = studentMap.get(roll);
        student.setName(Name);
        studentMap.put(roll, student);
        return "student name updated successfully";
    }
    @DeleteMapping("/removeAllStudent")
    public String removeAllStudent(){
//        studentMap = new HashMap<>();
        for(int key : studentMap.keySet()){
            studentMap.remove(key);
        }
        return "all the students are deleted successfullly";
    }
    @GetMapping("/get-student-by-name")
    public Student getStudentByName(@RequestParam String studentName){
        for(int key : studentMap.keySet()){
            if(studentMap.get(key).getName().equals(studentName)){
                return studentMap.get(key);
            }
        }
        return null;
    }
}
