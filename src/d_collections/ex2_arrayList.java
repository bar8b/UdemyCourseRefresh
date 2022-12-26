package d_collections;

import java.util.*;

public class ex2_arrayList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int action;
        ArrayList groceries = new ArrayList();
        do {
            System.out.printf("Available actions:%n " +
                    "0 - to shut down%n " +
                    "1 - to add item(s) to list comma delimited liest %n " +
                    "2 - to remove any items (comma delimited list)%n" +
                    "Enter a number for witch action you want to do:");
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

    public static ArrayList addItem(ArrayList groceries) {
        System.out.printf("What items would you like to add?%n");
        String[] items = sc.next().split(",");
        groceries.addAll(List.of(items));
        return groceries;

    }

    public static ArrayList removeItem(ArrayList groceries) {
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
