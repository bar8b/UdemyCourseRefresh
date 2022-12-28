package e_interface_AbstractClasses.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void saveObject (Savable objectToSave){
        for (int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+objectToSave.write().get(i) + " to sotrage device");
        }
    }

    public static void loadObject (Savable objectToLoad){
    }
}
