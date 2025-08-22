package schulung;

import java.util.Scanner;

public class Operatoren {

    public static void combineInputAndLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Ganzzahl ein.");
        int i = sc.nextInt();

        if (i % 2 != 0 && i >= 10 && i <= 20) {
            System.out.println("Treffer.");
        } else {
            System.out.println("Kein Treffer.");
        }
    }

    public static void combineEquals() {
        int  a = 5;
        int b = 2;
        int c = 3;
        if (a > b && b <= c || c < 0) {
            System.out.println("Die Bedinung ist wahr.");
        } else {
            System.out.println("Die Bedinung ist nicht wahr.");
        }
    }

    public static void zugangskontrolle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihr Alter ein.");
        int alter = sc.nextInt();
        System.out.println("Sind Sie ein Mitglied? Antworten Sie bitte mit (true/false)");
        boolean isMitglied = sc.nextBoolean();
        if (alter > 18 && isMitglied) {
            System.out.println("Der Zugang ist erlaubt.");
        } else {
            System.out.println("Der Zugang ist nicht erlaubt.");
        }
    }
}
