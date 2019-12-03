/**
 * Author:lxy1999
 * Created:2019/9/3
 */
public class selectSort implements Sorts {
    @Override
    public String name() {
        return "选择排序";
    }

    @Override
    public void sort(int[] array) {
        for(int i = 0;i<array.length;i++){
            //无序：[0,array.length-i) 有序：[array.length-i,array.length)
            int max = 0;
            for(int j = 1;j<array.length-i;j++){
                if(array[max]<array[j]){
                    max = j;
                }
                swap(array,max,array.length-i-1);
            }
        }
    }

    public static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
