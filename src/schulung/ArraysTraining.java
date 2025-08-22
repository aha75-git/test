package schulung;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTraining {
    public static void exerciseEasy() {
        System.out.println("Einfache Zahlenfolge ausgeben");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\r\nAlle Elemente eines Arrays anzeigen");
        String[] names = {"Andreas", "Max", "Peter", "Irene"};
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\r\nQuadratzahlen berechnen");
        int[] squareNumbers = {2, 4, 6, 8};
        for (int number : squareNumbers) {
            System.out.println(number * number);
        }
    }

    public static void exerciseMedium() {
        exerciseMediumEvenNumbers();
        System.out.println();
        exerciseMediumSum();
        System.out.println();
        exerciseMediumOutputCitiesWithIndex();
        System.out.println();
        exerciseMediumMinMax();
    }

    public static void exerciseBonus() {
        exerciseBonusArrayValuesDoubling();
        System.out.println();
        exerciseBonusCombineTwoArrays();
        System.out.println();
        exerciseBonusProcessUserInput();
        System.out.println();
        exerciseBonusSimpleGradeCalculator();
        System.out.println();
        exerciseBonusSortRandomNumbers();
    }

    private static void exerciseMediumEvenNumbers() {
        System.out.println("Nur gerade Zahlen ausgeben");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Ausgabe mit der for-Schleife");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Ausgabe mit der for-each-Schleife");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void exerciseMediumSum() {
        System.out.println("Summe berechnen");
        int[] numbers = {1, 22, 31, 4, 17, 88, 59, 100};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Die Summe ist: " + sum);
    }

    private static void exerciseMediumOutputCitiesWithIndex() {
        System.out.println("Städtenamen mit dem Index ausgeben\r\n");
        String[] cities = {"Köln", "Dortmund", "Berlin", "München"};
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + " [" + i + "]");
        }
    }

    private static void exerciseMediumMinMax() {
        System.out.println("Minimum und Maximum finden");
        int[] numbers = {22, 31, 4, 17, 2, 88, 59, 100};
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Der kleinste Wert ist: " + min);
        System.out.println("Der größte Wert ist: " + max);
    }

    private static void exerciseBonusArrayValuesDoubling() {
        System.out.println("Array-Werte verdoppeln");
        int[] numbers = {22, 31, 4, 17, 2, 88, 59};
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println("Array-Werte wurden verdoppelt");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void exerciseBonusCombineTwoArrays() {
        System.out.println("Zwei Arrays kombinieren\r\n");

        String[] firstNames = {"Andreas", "Max", "Peter", "Irene"};
        String[] lastNames = {"Mustermann", "Otto", "Wagner", "Müller"};

        for (int i = 0; i < firstNames.length; i++) {
            System.out.println(firstNames[i] + " " + lastNames[i]);
        }
    }

    private static void exerciseBonusProcessUserInput() {
        System.out.println("Benutzereingabe verarbeiten\r\n");
        System.out.println("Geben Sie bitte eine Anzahl von 5 Ganzzahlen durch Komma getrennt ein.");
        Scanner scanner = new Scanner(System.in);
        String[] numbers =  scanner.nextLine().split(",");
        for  (String number : numbers) {
            System.out.println(number);
        }
    }

    private static void exerciseBonusSimpleGradeCalculator() {
        System.out.println("Einfacher Notenrechner\r\n");
        int[] gradesNumbers = {50, 70, 95, 60};
        int average = 0;
        for (int number : gradesNumbers) {
            average += number;
        }
        average /= gradesNumbers.length;
        System.out.println("Durchschnitt: " + average + "\r\n");
        if (average < 70) {
            System.out.println("Nicht bestanden");
        } else {
            System.out.println("Bestanden");
        }
    }

    private static void exerciseBonusSortRandomNumbers() {
        System.out.println("Zufallszahlen sortieren\r\n");
        int[] randomNumbers = {50, 70, 95, 60, 2, 5, 77, 55, 8, 4, 99, 34};
        int average = 0;
        StringBuilder output = new StringBuilder();
        for (int number : randomNumbers) {
            output.append(number).append(" ");
        }
        System.out.println(output.toString());
        output = new StringBuilder();

        Arrays.sort(randomNumbers);

        for (int number : randomNumbers) {
            average += number;
            output.append(number).append(" ");
        }
        System.out.println(output.toString());
        System.out.println();
        average /= randomNumbers.length;
        System.out.println("Durchschnitt: " + average + "\r\n");
        System.out.println("Min: " + randomNumbers[0]+ "\r\n");
        System.out.println("Max: " + randomNumbers[randomNumbers.length - 1]+ "\r\n");
    }
}
