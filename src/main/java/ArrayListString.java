import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> seasons = new ArrayList<String>();
        seasons.add("Лето");
        seasons.add("Зима");
        seasons.add("Весна");
        seasons.add("Осень");
        System.out.println(seasons);

        Collections.sort(seasons);
        System.out.println("Отсортированный в алфавитном порядке " + seasons);

        Collections.reverse(seasons);
        System.out.println("Отсортированный в обратном алфавитном порядке " + seasons);
        seasons.clear();
    }
}
