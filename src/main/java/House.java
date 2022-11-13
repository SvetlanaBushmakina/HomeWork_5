import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> tenantsHouse = new HashMap<>();
        tenantsHouse.put("Бушмакина Светлана Ревовна", 28);
        tenantsHouse.put("Лисина Алиса Игоревна", 61);
        tenantsHouse.put("Евдокимова Лукерья Алексеевна", 56);
        tenantsHouse.put("Стаканченко Андрей Рудольфович", 37);
        tenantsHouse.put("Пузенко Дмитрий Александрович", 10);
        System.out.println(tenantsHouse);
        ArrayList<String> age = new ArrayList<>();
        tenantsHouse.forEach((key, value) -> {
            if (value >= 18) {
                age.add(key);
            }
        });
        Collections.sort(age);
        System.out.println(age);
    }
}
