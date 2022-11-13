import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        List<Integer> lottery = new ArrayList<Integer>(100);
        for (int i = 1; i <= 100; i++) {
            lottery.add(i);
        }
        Collections.shuffle(lottery);
        System.out.println(lottery);
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }
    }
}
