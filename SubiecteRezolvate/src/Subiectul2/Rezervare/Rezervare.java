package Subiectul2.Rezervare;


import Subiectul2.Abonament.Abonament;

public class Rezervare {
    Abonament abonament;
    private String numeClient;

    public Rezervare( String numeClient, Abonament abonament) {
        this.numeClient = numeClient;
        this.abonament = abonament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare");
        sb.append(", numeClient='").append(numeClient);
        sb.append("abonament=").append(abonament).append('\'');

        return sb.toString();
    }


}
