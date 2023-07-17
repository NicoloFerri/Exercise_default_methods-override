package javaOOPAdvanced_V2.defaultMethodsOverride;

import java.sql.SQLOutput;

public class Tester {
    public static void main(String[] args) {
SmartphonePrice p1 = new SmartphonePrice("Producer", 500);
SmartphonePrice p2 = new SmartphonePrice("Producer",900);

SmartphonePrice r1 = new SmartphonePrice("Retail", 899.99);
SmartphonePrice r2 = new SmartphonePrice("Retail", 1099.99);

Smartphone s1 = new Smartphone("Iphone", "14 Max" , 4000, p1,r1);
        Smartphone s2 = new Smartphone("Samsung", "S12" , 5000, p2,r2);

        System.out.println("DETTAGLI PRIMO SMARTPHONE : ");
        System.out.println(s1);
        System.out.println("\n");
        System.out.println("DETTAGLI SECONDO SMARTPHONE : ");
        System.out.println(s2);

        try {
            Smartphone clonedSmartphone = (Smartphone) s1.clone();
            System.out.println("\nDettagli dello smartphone creato:");
            System.out.println(clonedSmartphone);
            System.out.println("\nOperazione di cloning andata a buon fine : " + s1.equals(clonedSmartphone));
        } catch (Exception exception) {
            System.out.println("\nE' incorso un errore nella clonazione dello smartphone:");
            exception.printStackTrace();
            System.out.println("\nErrore : " + exception.getMessage());
        }

    }
}
