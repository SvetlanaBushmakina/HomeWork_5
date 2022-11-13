import java.util.HashMap;

public class CatsAndDogs {
    public static void main(String[] args) {
        HashMap<String, Integer> cats = new HashMap<>();
        cats.put("Пуся", 3);
        cats.put("Мармеладка", 2);
        cats.put("Вульф", 5);

        HashMap<String, Integer> dogs = new HashMap<>();
        dogs.put("Грей", 7);
        dogs.put("Тузик", 8);
        dogs.put("Джек", 1);

        HashMap<String, Integer> animals = new HashMap<>();
        animals.putAll(cats);
        animals.putAll(dogs);
        System.out.println(animals);
    }
}
