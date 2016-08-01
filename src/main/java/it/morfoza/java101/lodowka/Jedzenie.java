package it.morfoza.java101.lodowka;

import java.util.List;

public class Jedzenie {

    String nazwa;
    String skladniki;

    public Jedzenie(String nazwa, String skladniki) {

        this.nazwa = nazwa;
        this.skladniki = skladniki;
    }

    public String toString() {
        return "Jedzenie: [" + nazwa + " - " + " " + skladniki + "]";
    }
}
