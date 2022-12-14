package b_Inheritance.ex8_ComplexNumber;

//        A complex number is _brudnopis.a.a number that can be expressed in the form _brudnopis.a.a + bi, where _brudnopis.a.a and b are real numbers, and i is _brudnopis.a.a solution of the equation x2 = −1.
//        Because no real number satisfies this equation, i is called an imaginary number.
//        For the complex number _brudnopis.a.a + bi, _brudnopis.a.a is called the real part, and b is called the imaginary part.
//        To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.
//        For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i.
//        For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
//        → OUTPUT
//
//        one.real= 2.0
//        one.imaginary= 2.0
//        one.real= -0.5
//        one.imaginary= 3.5
//        number.real= 3.0
//        number.imaginary= -5.0

public class Main {

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
