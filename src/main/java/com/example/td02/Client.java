package com.example.td02;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.web.client.HttpServerErrorException;

import java.util.ArrayList;
import java.util.List;

enum Status {
    Celibataire,
    Marié,
    Divorcé
}

public class Client extends Personne {
    private int noClient;
    private float salaire;
    private Status statusMatrimonial;
    private int annéeNaissance;
    private int NIP;

    private List<Compte> comptes = new ArrayList<Compte>();
    private Gestionnaire gestionnaire;

    private void AddCompte()
    {

    }

    private float AddFoundCompte(float found, Compte compte)
    {
        return 0;
    }

    private float RemoveFoundCompte(float found, Compte compte)
    {
        return 0;
    }

    private void ShowTransactions()
    {

    }

    private void ShowFounds()
    {

    }
}
