package g_javaCollections.map;

import java.util.HashMap;
import java.util.Map;

//- nie ma setteró
//- pola sa final private
//- klasa nie może być dziedziczona
//- jeżeli klasa jest dziedziczona w interfejsach to nie mogą być udostępniane
//        - metody które będą modyfikowane
//        - referencje

public class ImmutableClass {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public ImmutableClass(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}