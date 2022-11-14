import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SolarSystem {
    public static void main(String[] args) {
        List<String> solarSystem = new ArrayList<String>();
        solarSystem.add("mercury");
        solarSystem.add("venus");
        solarSystem.add("earth");
        solarSystem.add("mars");
        solarSystem.add("jupiter");
        solarSystem.add("saturn");
        solarSystem.add("neptune");
        solarSystem.add("uranus");
        System.out.println(solarSystem);

        Collections.swap(solarSystem, 6,7);
        System.out.println(solarSystem);
    }
}
