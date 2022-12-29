package e_interface_AbstractClasses.ex2_playerMonster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player basia = new Player("Basia", 100, 150);
        System.out.println(basia.toString());
        saveObject(basia);
        basia.setHitPoints(80);
        System.out.println(basia);
        basia.setWeapon("Strombringer");
        saveObject(basia);
        loadObject(basia);
        System.out.println(basia);

        Savable warewolf = new Monsters("Werewolf", 10, 40);

        //WAŻNE!!! Rzutowanie na klse parametru interfejsu
        System.out.println("Strength = " + ((Monsters) warewolf).getStrenght());
        System.out.println(warewolf);
        saveObject(warewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n 1 to enter a string \n 0 to quit");
        while (!quit) {
            System.out.println("Coose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = sc.nextLine();
                    values.add(index, stringInput);
                    index ++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Savable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to sotrage device");
        }
    }

    public static void loadObject(Savable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
