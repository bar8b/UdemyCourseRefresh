package a_basics_oneToSix;

public class Ex15_devideBy {
    public static void main(String[] args) {

        int count = 0;
        int loop = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += i;
                System.out.println(i + " jest podzielna przez 3 i przez 5");
                loop++;
            }
            if (loop == 5) {
                System.out.println(count);
                break;
            }
        }
    }
}


