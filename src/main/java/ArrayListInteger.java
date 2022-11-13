import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(5);
        integerList.add(10);
        integerList.add(8);
        integerList.add(77);
        System.out.println(integerList);

        Collections.sort(integerList);
        System.out.println("Отсортированый массив " + integerList);

        Collections.reverse(integerList);
        System.out.println("Отсортированный в обратном порядке массив " + integerList);
        integerList.clear();
    }
}
