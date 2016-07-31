package it.morfoza.zapachy;

public class Perfumy {

    String nazwa;
    String skladniki;


    public Perfumy(String nazwa, String skladniki){
        this.nazwa = nazwa;
        this.skladniki = skladniki;

    }

    public String toString() {
        return "Perfumy: [" + nazwa + " " + skladniki +"]";
    }
}
