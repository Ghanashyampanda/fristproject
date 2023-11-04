package com.example.fristproject.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin
{
    private int id;
    private String name;
    private String email;
    private String gender;
    private  int age;
}
