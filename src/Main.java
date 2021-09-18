public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] resultArray = filter(array, count(array));
        sort(resultArray);
        print(resultArray);
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    private static void sort(int[] resultArray) {
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
    }

    private static int count(int[] array) {  //получение количества ячеек нового массива
        int j = 0;
        for (int k : array) {
            if (k > 0) {
                if (k % 2 == 0) {
                    j++;
                }
            }
        }
        return j;
    }

    private static int[] filter(int[] array, int count) {         //фильтрование положительных и четных, запись в новый массив
        int[] resultArray = new int[count];
        int j = 0;
        for (int k : array) {
            if (k > 0) {
                if (k % 2 == 0) {
                    resultArray[j] = k;
                    j++;
                }
            }
        }
        return resultArray;
    }

    private static void print(int[] array) {        //вывод на экран
        for (int j : array) {
            System.out.println(j);
        }
    }

}