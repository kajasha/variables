package it.morfoza.zapachy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perfumy perfumy1;
        Perfumy perfumy2;
        Perfumy perfumy3;

        perfumy1 = new Perfumy("CK", "Mandarynka");
//        perfumy1.nazwa = "CK";
//        perfumy1.skladniki = "Mandarynka";

        perfumy2 = new Perfumy("Chanel", "Róża, Piżmo");
//        perfumy2.nazwa = "Chanel";
//        perfumy2.skladniki = "Róża, Piżmo";

        perfumy3 = new Perfumy("Dior", "Arbuz, Cynamon, Piżmo");
//        perfumy3.nazwa = "Dior";
//        perfumy3.skladniki = "Arbuz, Cynamon";

        System.out.println(perfumy1);
        System.out.println(perfumy2);
        System.out.println(perfumy3);


        List<Perfumy> listaPerfum = new ArrayList<>();
        listaPerfum.add(perfumy1);
        listaPerfum.add(perfumy2);
        listaPerfum.add(perfumy3);

        System.out.println(listaPerfum);

        Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj składnik");
        String skladnik = wejscie.nextLine();

        for (Perfumy perfumy: listaPerfum) {
            if(perfumy.skladniki.contains(skladnik)) {
                System.out.println(perfumy);
            }
        }
    }

}
