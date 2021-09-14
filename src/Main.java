import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = new ArrayList();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                int j = intList.get(i);
                if (j % 2 == 0) {
                    resultList.add(j);
                }
            }
        }
        Collections.sort(resultList);
        for (int list : resultList) {
            System.out.println(list); //реализация фильтров, сортировки и вывода без применения Stream API
        }
    }
}
