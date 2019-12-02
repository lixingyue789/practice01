import java.util.Random;
import java.util.Stack;

/**
 * Author:lxy1999
 * Created:2019/9/2
 */
public class Solution1 {
    //随机创建一个长度为10的数组
    public static int[] createArray(){
        Random random = new Random(20190829);
        int[] a = new int[10];
        for(int i = 0;i<a.length;i++){
            a[i] = random.nextInt(100);
        }
        return a;
    }
    //打印数组元素
    public static void showArray(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    //将数组中的两个下标所代表的元素交换
    public static void swap(int[] array,int a,int b){
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }
    public static int partition(int[] array,int left,int right){
        //首先定义基准值为数组最后一个元素
        int indexPartition = array[right];
        //定义low指向数组首元素，定义high指向数组尾元素，当low小于high时循环继续
        int low = left;
        int high = right;
        while (low<high){
            while (low<high&&array[low]<=indexPartition){
                low++;
            }
            while (low<high&&array[high]>=indexPartition){
                high--;
            }
            //当两边都停止时，互相交换
            swap(array,low,high);
        }
        //low或high就为基准值
        swap(array,right,low);
        return low;
    }
    //快速排序非递归
    public static void quickSortNDG(int[] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length-1);
        stack.push(0);
        while (!stack.isEmpty()){
            int left = stack.pop();
            int right = stack.pop();
            if(left>right){
                continue;
            }
            int indexPartition = partition(array,left,right);
            //区间为：[left,indexPartition-1][indexPartition+1,right]
            stack.push(indexPartition-1);
            stack.push(left);

            stack.push(right);
            stack.push(indexPartition+1);
        }
    }
    //归并排序
    public static void mergeSort(int[] array){
        //左闭右开
        mergeSortInternal(array,0,array.length);
    }

    public static void mergeSortInternal(int[] array,int left,int right){
        //数组中只剩一个元素，或者没有元素
        if(left+1>=right){
            return;
        }
        //[left,mid)[mid,right)
        int mid = (left+right)/2;
        mergeSortInternal(array,left,mid);
        mergeSortInternal(array,mid,right);
        //合并有序数组
        merge(array,left,mid,right);
    }

    public static void merge(int[] array,int left,int mid,int right){
        int length = right-left;
        int[] extra = new int[length];
        int pLeft = left;
        int pRight = mid;
        int pExtra = 0;
        while (pLeft<mid&&pRight<right) {
            if (array[pLeft] <= array[pRight]){
                extra[pExtra++] = array[pLeft++];
            } else {
                extra[pExtra++] = array[pRight++];
            }
        }
        while (pLeft < mid) {
            extra[pExtra++] = array[pLeft++];
        }
        while (pRight < right) {
            extra[pExtra++] = array[pRight++];
        }
        for (int i = 0; i < length; i++) {
            array[left+i] = extra[i];
        }
    }
    //归并排序非递归
    public static void mergeFDG(int[] array){
        for(int i = 1;i<array.length;i = i*2){
            for(int j = 0;j<array.length;j = j+2*i){
                int low = j;
                int mid = j+i;
                int high = mid+i;
                if(mid>array.length){
                    continue;
                }
                if(high>array.length){
                    high = array.length;
                }
                merge(array,low,mid,high);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = createArray();
        showArray(array);
        System.out.println();
        quickSortNDG(array);
        showArray(array);
        System.out.println();
        System.out.println("================================");
        mergeSort(array);
        showArray(array);
        System.out.println();
        mergeFDG(array);
        showArray(array);
        System.out.println();
    }
}
