import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] resultArray = filter(array);

        boolean needIteration = true;                     //сортировка
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < resultArray.length; i++) {
                if (resultArray[i] < resultArray[i - 1]) {
                    swap(resultArray, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(resultArray)); //todo: вывод на экран смогла только c toString,
                                                          //todo: подскажите как можно сделать без него, если нужно без него.
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static int[] filter(int[] array) {         //фильтрование положительных и четных
        int[] resultArray = new int[5];                //todo: количество ячеек с положительными четными числами мы знаем,
                                                       //todo:  исходя из того, что данные были предоставленны,
                                                       //todo: как реализовать это задание без знания количества ячеек,
                                                       //todo: я совершенно незнаю. Подскажите)
        int j = 0;
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            int k = array[i];
            if (k > 0) {
                if (k % 2 == 0) {
                    resultArray[j] = k;
                    j++;
                }
            }
        }
        return resultArray;
    }

}

