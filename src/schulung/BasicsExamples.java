package schulung;

import java.util.Scanner;

public class BasicsExamples {
    public static void basicsCall() {
        Scanner sc = new Scanner(System.in);
     /*   System.out.println("Geben Sie bitte Ihren Namen ein.");
        String name = sc.nextLine();
        System.out.println("Geben Sie bitte Ihr Alter ein.");
        String alter = sc.nextLine();
        System.out.println("Geben Sie bitte Ihren Lieblingsspruch ein.");
        String lieblingsSpruch = sc.nextLine();
        System.out.println("Hallo " + name);
        System.out.println("Dein Alter: " + alter);
        System.out.println("Dein Lieblingsspruch: " + lieblingsSpruch);
        System.out.println();
        System.out.println(name + "\t" + alter + "\t" + lieblingsSpruch);
        System.out.println();
        System.out.println("Ich möchte eine Addition machen. Geben Sie bitte die erste Zahl ein.");
        int zahl1 = sc.nextInt();
        System.out.println("Geben Sie bitte die zweite Zahl ein.");
        int zahl2 = sc.nextInt();
        int ergebnis = zahl1 + zahl2;
        System.out.println("Das Ergebnis der Addition ist: " + ergebnis);

        double normal = 0.75;
        double wissenschaftlich = 1.2e4; // 1.2 × 10^4 = 12000
        float mitUnterstrich = 3.141_592f;
        System.out.println(normal + "; " + wissenschaftlich + "; " + mitUnterstrich);

        double ergebnis = 0.1 + 0.2;
        System.out.println(ergebnis);

        BigDecimal zahl1 = new BigDecimal("0.1");
        BigDecimal zahl2 = new BigDecimal("0.2");
        BigDecimal ergebnis2 = zahl1.add(zahl2);
        System.out.println(ergebnis2);

        int alter = 50;
        System.out.println(alter);
        double height = 1.75;
        System.out.println(height);
        char firstChar = 'A';
        System.out.println(firstChar);
        String name = "Andreas Haffner";
        System.out.println(name);
        System.out.println();
        var result = "Mein Name ist " + name + ", ich bin " + alter + " Jahre alt und " +
                height + " Meter groß.";
        System.out.println(result);
        result = MessageFormat.format("Mein Name ist {0}, ich bin {1} Jahre alt und {2} Meter groß.", name, alter, height);
        System.out.println(result);
        result = """
                Mein Name ist %s, ich bin %d Jahre alt und %.2f Meter groß.
                """.formatted(name, alter, height);
        System.out.println(result);

        boolean isAdult = false;
        if (alter >= 18) {
            isAdult = true;
        }
        System.out.println(isAdult);

        int i1 = 10;
        int i2 = 5;
        System.out.println(i1 + i2);
        System.out.println(i2 - i1);
        System.out.println(i1 * i2);
        System.out.println(i1 / i2);

        String s = "Hallo an alle.";
        System.out.println("Die Länge ist: " + s.length());
        System.out.println("Die erste Buchstabe ist: " + s.charAt(0));
        System.out.println(s.toUpperCase());
        System.out.println();

        System.out.println("Geben Sie bitte Ihren Vornamen ein.");
        String name = sc.nextLine();
        System.out.println("Geben Sie bitte Ihr Alter ein.");
        int alter = sc.nextInt();
        System.out.println("Geben Sie bitte Ihre Lieblingsbuchstabe ein.");
        char  lieblingsbuchstabe = sc.next().charAt(0);
        String result = MessageFormat.format(
                "Hallo {0}, dein Lieblingsbuchstabe ist {1} und du bist {2} Jahre alt.",
                name, lieblingsbuchstabe, alter);
        System.out.println(result);

        System.out.println("Geben Sie bitte die erste Kommazahl ein.");
        double d1 = sc.nextDouble();
        System.out.println("Geben Sie bitte die zweite Kommazahl ein.");
        double d2 = sc.nextDouble();
        if (d1 + d2 > 10){
            System.out.println("Die Summe ist größer 10");
        } else {
            System.out.println("Die Summe ist kleiner gleich 10");
        }

        System.out.println("Geben Sie bitte ein Zeichen ein.");
        char c = sc.next().charAt(0);
        if (isVokal(c)) {
            System.out.println("Vokal");
        }  else {
            System.out.println("Kein Vokal");
        }
        */

        miniProgramm();
    }

    private static boolean isVokal(char zeichen) {
        return zeichen == 'a' || zeichen == 'e' || zeichen == 'i' ||
                zeichen == 'o' || zeichen == 'u' ||
                zeichen == 'A' || zeichen == 'E' || zeichen == 'I' ||
                zeichen == 'O' || zeichen == 'U';
    }

    private static void miniProgramm() {
        /*
        Schreibe ein Programm, das:

            Zwei Ganzzahlen und eine Kommazahl einliest
            Eine Rechnung ausführt
            Das Ergebnis als Text in einem vollständigen Satz ausgibt
            Prüft, ob das Ergebnis positiv ist, und die Info ausgibt
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie bitte die erste Ganzzahl ein.");
        int i1 = sc.nextInt();
        System.out.println("Geben Sie bitte die zweite Ganzzahl ein.");
        int i2 = sc.nextInt();
        System.out.println("Geben Sie bitte eine Kommazahl ein.");
        double d = sc.nextDouble();
        var ergebnis = i1 + d - i2;
        String s = "Das Ergebnis ist: " +  ergebnis;
        if (ergebnis < 0.0) {
            s += " und es ist negativ.";
        } else {
            s += " und es ist positiv.";
        }
        System.out.println(s);
    }
}
