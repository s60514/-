import java.util.Arrays;

/*
 * 需求一个 不定长数组(int型)，可能无序，在不产生新的数组的情况下去重，并返回数组的有效数据长度
 */
public class test1 {

    public static void main(String[] args) {
        int[] array = { 4, 1, 7, 6, 9, 2, 8, 0, 3, 5, 1, 2, 4, 2 };
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        int p = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                array[p] = array[i + 1];
                p++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(p);

    }

    static private void sort(int[] arr) {
        int x;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }
}
