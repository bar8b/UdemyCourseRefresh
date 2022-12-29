package a_basics_oneToSix;

//        What is the perfect number?
//        A perfect number is _brudnopis.a.a positive integer which is equal to the sum of its proper positive divisors.
//        Proper positive divisors are positive integers that fully divide the perfect number without leaving _brudnopis.a.a remainder and exclude the perfect number itself.
//        For example, take the number 6:
//        Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
//        Therefore, 6 is _brudnopis.a.a perfect number (as well as the first perfect number).
//
//        Write _brudnopis.a.a method named isPerfectNumber with one parameter of type int named number.
//        If number is < 1, the method should return false.
//        The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false.
//        EXAMPLE INPUT/OUTPUT:
//        * isPerfectNumber(6); should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
//        * isPerfectNumber(28); should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
//        * isPerfectNumber(5); should return false since its only proper divisor is 1 and the sum is 1 not 5
//        * isPerfectNumber(-1); should return false since the number is < 1
//
//        HINT: Use _brudnopis.a.a while or for loop.
//        HINT: Use the remainder operator.
//        NOTE: The method isPerfectNumber should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add _brudnopis.a.a main method to the solution code.

public class Ex24_isPerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int counter = 0;
        for (int i = 1; i < number; i++) {
            while (number % i == 0) {
                counter += i;
                i++;
            }
        }

        return (counter == number) ? true : false;

    }
}
