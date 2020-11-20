package com.cybertek.model;

import com.cybertek.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mentor {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}
