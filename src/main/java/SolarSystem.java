import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

        solarSystem.set(6, "uranus");
        solarSystem.set(7, "neptune");
        System.out.println(solarSystem);
    }
}
