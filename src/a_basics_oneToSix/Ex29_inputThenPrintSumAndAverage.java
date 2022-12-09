package a_basics_oneToSix;

//        Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//        The method should not return anything(void)and it needs to keep reading int numbers from the keyboard.
//        When the user enters something that is not an int then it needs to print a message in the format"SUM = XX AVG = YY".
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.
//        EXAMPLES OF INPUT/OUTPUT:
//        EXAMPLE 1:
//        INPUT:
//        1, 2, 3, 4, 5, a
//        OUTPUT
//        SUM=15AVG=3
//
//        EXAMPLE 2:
//        INPUT:
//        hello
//        OUTPUT:
//        SUM=0AVG=0
//
//        TIP:Use Scanner to read an input from the user.
//        TIP:Use casting when calling the round method since it needs double as a parameter.
//        NOTE:Use the method Math.round to round the calculated average(double).The method round returns long.
//        NOTE:Be mindful of spaces in the printed message.
//        NOTE:Be mindful of users who may type an invalid input right away(see example above).
//        NOTE:The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far in the course.
//        NOTE:Do not add the main method to the solution code.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex29_inputThenPrintSumAndAverage {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        double sum = 0;
        double avarage = 0;
        double count = 0;
        boolean error = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                int number = sc.nextInt();
                sum += number;
                count++;
                avarage = Math.round(sum / count);
            } catch (InputMismatchException ex) {
                System.out.println("SUM = " + (int) sum + " AVG = " + (int) avarage);
                error = true;
            }
        } while (!error);
    }
}
