package a_basics_oneToSix;

//        Write _brudnopis.a.a method named printSquareStar with one parameter of type int named number.
//        If number is < 5, the method should print "Invalid Value".
//        The method should print diagonals to generate _brudnopis.a.a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
//        EXAMPLE INPUT/OUTPUT:
//        EXAMPLE 1
//        printSquareStar(5); should print the following:
//        → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
//        *****
//        ** **
//        * * *
//        ** **
//        *****
//        Explanation:
//        *****   5 stars
//        ** **   2 stars space 2 stars
//        * * *   1 star space 1 star space 1 star
//        ** **   2 stars space 2 stars
//        *****   5 stars
//        EXAMPLE 2
//        printSquareStar(8); should print the following:
//        ********  8 *
//        **    **  2 * - 4 s - 2 *
//        * *  * *  1 * - 1 s - 1 * - 2 s - 1 * - 1 s - 1 *
//        *  **  *  1 * - 2 s - 2 *
//        *  **  *
//        * *  * *
//        **    **
//        ********
//        The patterns above consist of _brudnopis.a.a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
//        * In the first or last row
//        * In the first or last column
//        * When the row number equals the column number
//        * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
//
//        HINT: Use _brudnopis.a.a nested loop (_brudnopis.a.a loop inside of _brudnopis.a.a loop).
//        HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" "); prints _brudnopis.a.a space and does not "move" to another line.
//        HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .
//        NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add _brudnopis.a.a main method to the solution code.

public class Ex28_printSquareStar {
    public static void main(String[] args) {

    }

//    public static void printSquareStar(int number) {
//        if (number < 5) {
//            System.out.println("Invalid Value");
//        }
//        String star = "*";
//        String space = " ";
//
//        for (int row = 1; row <= number; row++) {
//            if (row == 1 || row == row - 1) {
//                for (int i = 1; i <= number; i++) {
//                    System.out.print(star);
//                }
//            }else if ()
//        }
//
//    }
}
