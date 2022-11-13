import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinAndMaxOnArray {
    public static void main(String[] args) {
        Integer[] myArray = {1, 6, 55, -3, 27, 3};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(myArray));
        System.out.println(arrayList);
        System.out.println("Минимальное число: " + Collections.min(arrayList));
        System.out.println("Максимальное число: " + Collections.max(arrayList));
    }
}
