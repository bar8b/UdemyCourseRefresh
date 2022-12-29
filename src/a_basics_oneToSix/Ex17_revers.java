package a_basics_oneToSix;

public class Ex17_revers {

//    Write _brudnopis.a.a method called isPalindrome with one int parameter called number.
//    The method needs to return _brudnopis.a.a boolean.
//    It should return true if the number is _brudnopis.a.a palindrome number otherwise it should return false.
//    Check the tips below for more info about palindromes.
//    Example Input/Output
//    isPalindrome(-1221); → should return true
//    isPalindrome(707); → should return true
//    isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//            Tip: What is _brudnopis.a.a Palindrome number?  A palindrome number is _brudnopis.a.a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
//            Tip: Logic to check _brudnopis.a.a palindrome number
//
//    Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
//    If both are the the same then the number is _brudnopis.a.a palindrome otherwise it is not.
//    Tip: Logic to reverse _brudnopis.a.a number

//    Declare and initialize another variable to store the reverse of _brudnopis.a.a number, for example reverse = 0.
//    Extract the last digit of the given number by performing the modulo division (remainder).
//    Store the last digit to some variable say lastDigit = num % 10.
//    Increase the place value of reverse by one.
//    To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//    Add lastDigit to reverse.
//    Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
//    Repeat steps until number is not equal to (or greater than) zero.
//    A while loop would be good for this coding exercise.
//
//    Tip: Be careful with negative numbers. They can also be palindrome numbers.
//    Tip: Be careful with reversing _brudnopis.a.a number, you will need _brudnopis.a.a parameter for comparing _brudnopis.a.a reversed number with the starting number (parameter).
//    NOTE: The method isPalindrome needs to be defined as public static like we have been doing

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        while (number < 0) {
            number *= -1;
        }

        int revers = 0;
        int testNumber = number;
        do {
            int rest = testNumber % 10;
            if (testNumber > 9) {
                revers = (revers + rest) * 10;
            }else {
                revers +=rest;
            }
            testNumber -= rest;
            testNumber /= 10;
        } while (testNumber > 0);

        return (revers == number)? true : false ;

    }

}
