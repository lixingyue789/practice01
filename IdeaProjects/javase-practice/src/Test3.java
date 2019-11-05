import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/3/30
 * 冒泡法排序
 * 冒泡排序的时间复杂度为o(n^2)
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 77, 34, 1, 56, 90, 699};
        BubbleSort(arr);
    }

    public static void BubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}