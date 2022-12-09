package a_basics_oneToSix;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        System.out.println("wprowadz liczbe:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        switch (statement(value)) {
            case "1 st", "4 st" -> System.out.println("zimno");
            case "3 st", "2 st" -> System.out.println("cieplo");
            default -> System.out.println("nie ma innej mozliwosci");
        }

    }

    public static String statement(int value) {
        String quater = switch (value) {
            case 1, 2, 3 -> {
                yield "1 st";
            }
            case 4, 5, 6 -> {
                yield "2 st";
            }
            case 7, 8, 9 -> "3 st";
            case 10, 11, 12 -> "4 st";
            default -> "Zła odpowiedź";
        };
        return quater;
    }
}
