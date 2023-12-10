package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Değişken isimlendirmeleri java da camelCase ile yazılır
        String ortaMetin = "ilginizi cekebilir";
        String altMetin = "vade suresi";

        System.out.println(ortaMetin);

        // integer
        int vade = 12;

        double dolarDun = 18.25;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun) { //true
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun>dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        // array

        String[] krediler = {"Hizli kredi", "Maasini halkbanktan", "mutlu emekli"};

       // System.out.println(krediler[0]);
       // System.out.println(krediler[1]);
       // System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }

    }
}