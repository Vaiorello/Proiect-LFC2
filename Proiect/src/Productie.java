package com.company;

public class Productie {
    private char stanga;
    private String dreapta;

    Productie(String stanga, String dreapta){
        this.stanga = stanga.charAt(0);
        this.dreapta = dreapta;
    }

    public char getStanga() {
        return stanga;
    }

    public void setStanga(char stanga) {
        this.stanga = stanga;
    }

    public String getDreapta() {
        return dreapta;
    }

    public void setDreapta(String dreapta) {
        this.dreapta = dreapta;
    }

    @Override
    public String toString() {
        return "Productie{" +
                "stanga=" + stanga +
                ", dreapta='" + dreapta + '\'' +
                '}';
    }
}
