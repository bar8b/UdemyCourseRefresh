package d_arrays;

import java.util.*;

public class ex2_arrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int action = 0;
        while (action ==0){
        System.out.printf("Available actions:%n " +
                "0 - to shut down%n " +
                "1 - to add item(s) to list comma delimited liest %n " +
                "2 - to remove any items (comma delimited list)%n" +
                "Enter a number for witch action you want to do:");
        int action = sc.nextInt();
        ArrayList groceries = new ArrayList();
        if (action !=0){
        switch (action){
            case 1 -> {
                System.out.println("what item would you like to add?");
                String item = sc.next();
                addItem (groceries, item);
            };
            default ->
        }



    }
//  add, remove, check, print sorted list

    public static ArrayList <> addItem (ArrayList <>(groceries), String item){
        groceries.add(item);
        groceries.sort(Comparator.naturalOrder());
        return groceries;
    }

}

