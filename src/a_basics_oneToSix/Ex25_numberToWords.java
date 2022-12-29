package a_basics_oneToSix;

//        Write _brudnopis.a.a method called numberToWords with one int parameter named number.
//        The method should print out the passed number using words for the digits.
//        If the number is negative, print "Invalid Value".
////
//         * numberToWords(123); should print "One Two Three".
//         * numberToWords(1010); should print "One Zero One Zero".
//         * numberToWords(1000); should print "One Zero Zero Zero".
//         * numberToWords(-12); should print "Invalid Value" since the parameter is negative

public class Ex25_numberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(23645);

    }

    public static void numberToWords(int number) {
        int revers = 0;
        int testNumber = number;
        int i = 0;
        do {
            int rest = testNumber % 10;
            if (testNumber > 9) {
                revers = (revers + rest) * 10;
            } else {
                revers += rest;
            }
            testNumber -= rest;
            testNumber /= 10;
            i++;
        } while (testNumber > 0);

        int fake = revers;

        if (number >= 0) {
            int counter;
            while (i > 0) {
                counter = fake % 10;
                switch (counter) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }

                fake = (fake - counter) / 10;
                i--;
            }
        } else {
            System.out.println("Invalid Value");
        }
        System.out.println();


    }
}
