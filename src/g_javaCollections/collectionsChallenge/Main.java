package g_javaCollections.collectionsChallenge;

//        Modify the previous HeavenlyBody example so that the HeavenlyBody class also has a "bodyType" field.
//        This field will store the type of HeavenlyBody (PLANET, DWARF_PLANET, MOON).
//        For each of the three types that is supported, subclass the HeavenlyBody class so that your program
//        can create objects of the appropriate type.
//        There is a restriction that the only satellites that planets can have must be moons.
//        Implement the following:
//
//        1.HeavenlyBody (abstract)
//        It has three private final fields. A Key called key, a double called orbitalPeriod and a Set
//        of type HeavenlyBody called satellites.
//        A constructor that takes a String (name of the HeavenlyBody), a double (its orbital period)
//        and a BodyType. key is initialised with a new Key object and satellites is initialised with a new HashSet.
//              Eight methods:
//              - getOrbitalPeriod(), getter for orbitalPeriod.
//              - getKey(), getter for key.
//              - addSatellite(), it takes a HeavenlyBody as a parameter and returns true if it was added
//              successfully, false otherwise.
//              - getSatellites(), return a new HashSet populated with satellites.
//              - equals(), override method declared as public final. Two HeavenlyBody objects are equal if their keys are equal.
//              - hashCode(), override method declared as public final. Return the hash code of key.
//              - makeKey(), declared as public static and returns a new Key object.
//              - toString(), override method. Return the string representation as: name: bodyType, orbitalPeriod.
//              - A nested enum named BodyTypes declared as public.
//              - And a nested class declared as public static final named Key.
//
//        2. BodyTypes (nested enum)
//         It has three constants: PLANET, DWARF_PLANET and MOON.
//
//        3. Key (nested class)
//        It has two fields. A String called name and a BodyTypes called bodyType.
//        A constructor declared as private that takes a String and a BodyTypes and initialises the fields with it.
//        And five methods:
//        getName(), getter for name.
//        getBodyType(), getter for bodyType.
//        equals(), override method. Two Key objects are equal if they have the same name and bodyType.
//        hashCode(), override method. Return the hash code for name, plus the hash code for bodyType,
//        plus an arbitrary number (random).
//        toString(), override method. Return the string representation as: name: bodyType.
//
//        4.Planet
//        A constructor that takes a String (name of the planet) and a double (its orbital period) and
//
//        calls its parent class with its arguments.
//         And one method
//         addSatellite(), override method. Add the satellite if its body type is a moon.
//
//        5. DwarfPlanet
//        A constructor that takes a String (name of the dwarf planet) and a double (its orbital period)
//        and calls its parent class with its arguments.
//
//        6. Moon
//        A constructor that takes a String (name of the moon) and a double (its orbital period) and calls
//        its parent class with its arguments.
//        TIP:Be extremely careful with the spelling of the names of the fields, constructors and methods.
//        TIP:Be extremely careful about spaces/spelling/format in the returned String by toString().
//        NOTE All fields are private (unless stated otherwise).
//        NOTE All constructors are public (unless stated otherwise).
//        NOTE All methods are public (unless stated otherwise).
//        NOTE Do not add a main method to the solution code.


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(tempMoon.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 0.3, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("IO", 1.8, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new HeavenlyBody("Europa", 3.5, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede", 7.1, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        tempMoon = new HeavenlyBody("Callisto", 16.7, HeavenlyBody.BodyTypes.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatelite(tempMoon);

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptun", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto ", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet :planets){
            System.out.println("\t" + planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoon : body.getSatellites()){
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets){
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons){
            System.out.println("\t"+ moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

    }
}
