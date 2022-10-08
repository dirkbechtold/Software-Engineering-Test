package Aufgabe01;

import java.util.Scanner;

public class TestCalculator {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Willkommen!");

            System.out.println("Welche Operation?");
            System.out.println("(0) Addition");
            System.out.println("(1) Subtraktion");
            System.out.println("(2) Multiplikation");
            System.out.println("(99) Beenden");

            Scanner scanner = new Scanner(System.in);

            int operation = scanner.nextInt();
            if (operation == 99) {
                break;
            }


            System.out.println("Bitte erste Zahl eingeben: ");

            double first = scanner.nextDouble();

            System.out.println("Bitte zweite Zahl eingeben: ");

            double second = scanner.nextDouble();

            double result = 0;

            if (operation == 0) {
                System.out.println(first + second);
            } else if (operation == 1) {
                System.out.println(first - second);
            } else if (operation == 2) {
                System.out.println(first * second);
            }

        }
    }
}
