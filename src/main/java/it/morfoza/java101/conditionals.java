package it.morfoza.java101;


public class conditionals {

    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;
        boolean result = 1 <= 2;

        int wiek = 21;


        boolean jestWGimbazie = (wiek >= 13) && (wiek <= 16);

        if (jestWGimbazie) {
            System.out.println("jestWGimbazie");
        }
        boolean nieJestWGimbazie = wiek < 13 || wiek > 16;

        System.out.println(nieJestWGimbazie);
        nieJestWGimbazie = ! jestWGimbazie;

        if (wiek > 16 && wiek < 20) {
            System.out.println("jestWLiceum");
        }

         boolean nieJestWLiceum = wiek > 20 || wiek < 16;
        if(nieJestWLiceum){
            System.out.println("nieJestWLiceum");
        }




    }

}
