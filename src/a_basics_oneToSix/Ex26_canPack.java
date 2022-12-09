package a_basics_oneToSix;

//        Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
//        The parameter bigCount represents the count of big flour bags (5 kilos each).
//        The parameter smallCount represents the count of small flour bags (1 kilo each).
//        The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
//        Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.
//        If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
//        If any of the parameters are negative, return false.
//
//        EXAMPLE INPUT/OUTPUT:
//        * canPack (1, 0, 4);      false
//        * canPack (1, 0, 5);      true
//        * canPack (0, 5, 4);      true
//        * canPack (2, 2, 11);     true
//        * canPack (-3, 2, 12);    false
//        * canPack (1, 0, 6);      false
//        * canPack(2, 1, 5);       true
//
//        NOTE: The method canPack should be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a main method to the solution code.

public class Ex26_canPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(5, 3, 24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int dSum = bigCount * 5;
        int sum = dSum + smallCount;
        if (dSum < 0 || smallCount < 0 || goal < 0 || sum < goal) {
            return false;
        }
        if (goal % 5 <= smallCount || smallCount >= goal || goal % 5 == 0) {
            return true;
        }
        return false;
    }
}
