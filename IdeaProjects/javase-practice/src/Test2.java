/**
 * Author:lxy1999
 * Created:2019/3/30
 * 二分查找
 * 二分查找的时间复杂度为 o(log(n))
 * 斐波那契数列的时间复杂度为o(2^n) 空间复杂度为 o(n)
 * n的阶乘的时间复杂度为o(n) 空间复杂度为 o(n)
 **/
public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 8};
        System.out.println(find(arr,7));

    }

    public static int find(int[] arr, int v) {
        int left = 0;
        int right = arr.length;
        //左闭右开
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] == v) {
                return mid;
            }
            if (arr[mid] > v) {
               right = mid;
            }
            if(arr[mid] < v){
                left = mid + 1;
            }
        }
        return -1;
    }

}





