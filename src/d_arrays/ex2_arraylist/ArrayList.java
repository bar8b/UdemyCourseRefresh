package d_arrays.ex2_arraylist;

import java.util.*;

public class ArrayList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int action;
        java.util.ArrayList groceries = new java.util.ArrayList();
        do {
            System.out.printf("Available actions:%n " +
                    "0 - to shut down%n " +
                    "1 - to add item(s) to list comma delimited liest %n " +
                    "2 - to remove any items (comma delimited list)%n" +
                    "Enter _brudnopis.a.a number for witch action you want to do:");
            action = sc.nextInt();

            switch (action) {
                case 1 -> {
                    addItem(groceries);

                }
                case 2 -> {
                    removeItem(groceries);
                }
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        } while (action != 0);
    }

    public static java.util.ArrayList addItem(java.util.ArrayList groceries) {
        System.out.printf("What items would you like to add?%n");
        String[] items = sc.next().split(",");
        groceries.addAll(List.of(items));
        return groceries;

    }

    public static java.util.ArrayList removeItem(java.util.ArrayList groceries) {
        System.out.printf("What item would like to remove?%n");
        String item = sc.next();
        if (!groceries.contains(item)) {
            System.out.println("The item do not exist on this list");
        } else {
            groceries.remove(item);

        }
        return groceries;
    }

}
