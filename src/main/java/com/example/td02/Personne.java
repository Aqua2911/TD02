package com.example.td02;

enum Gender {
    Male,
    Female,
    Other
}

public class Personne {
    private String firstName;
    private String lastName;
    private String tel;
    private String email;
    private Gender gender;

    private Banque banque;
}
