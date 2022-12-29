package a_basics_oneToSix;

//        Write _brudnopis.a.a method named printFactors with one parameter of type int named number.
//        If number is < 1, the method should print "Invalid Value".
//        The method should print all factors of the number. A factor of _brudnopis.a.a number is an integer which divides that number wholly (i.e. without leaving _brudnopis.a.a remainder).
//        For example, 3 is _brudnopis.a.a factor of 6 because 3 fully divides 6 without leaving _brudnopis.a.a remainder. In other words 6 / 3 = 2.
//
//        EXAMPLE INPUT/OUTPUT:
//        * printFactors(6); → should print 1 2 3 6
//        * printFactors(32); → should print 1 2 4 8 16 32
//        * printFactors(10); → should print 1 2 5 10
//        * printFactors(-1); → should print "Invalid Value" since number is < 1
//
//        HINT: Use _brudnopis.a.a while or for loop.
//        NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by _brudnopis.a.a space.
//        For example, the printout for printFactors(10); can be: 1, 2, 5, 10
//        NOTE: The method printFactors should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add _brudnopis.a.a main method to the solution code.

public class Ex22_printFactors {

    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                while (number % i == 0) {
                    System.out.print(i);
                    i++;
                }
            }

        }
    }
}