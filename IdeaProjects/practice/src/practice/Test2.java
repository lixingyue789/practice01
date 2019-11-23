package practice;

/**
 * Author:lxy1999
 * Created:2019/11/8
 */
public class Test2 {
    public static void partition(int[] array, int indexPartition) {
        int i = 0;
        int j = array.length-1;
        while (i<j){
            //while (i<j&&array[i])
        }
    }

    public static void quickInnerSort(int[] array, int left, int right) {
        int indexPartition = array.length-1;
        partition(array,indexPartition);
    }

    public static void quickSort(int[] array,int left,int right){
        quickInnerSort(array,left,right);
    }

    public static void main(String[] args) {

    }
}
