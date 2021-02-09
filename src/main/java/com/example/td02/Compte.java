package com.example.td02;

enum TypeCompte {
    Cheque,
    Epargne,
    Placement
}

public class Compte {
    private int noCompte;
    private TypeCompte typeCompte;
    private float soldeInit;

    private Client client;
}
