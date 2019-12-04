import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/8/29
 */
public class Solution {
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
    //冒泡排序
    public static void bubbleSort(int[] array){
        //假设有n个数，只需要选前n-1大的数排在后面就有序，所以外层循环只需要n-1次
        for(int i = 0;i<array.length-1;i++){
            //无序：[0,array.length-i) 有序：[array.length-i,array.length)
            //冒泡排序是在无序中两两进行比较，将最大到交换到最后，需要比较array.length-i-1次
            for(int j = 0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }
    //升级版的选择排序：选择出最大的与最小的，将最小的放在数组前面，将最大的放在数组后面
    public static void selectSortVersion(int[] array){
        int low = 0;
        int high = array.length-1;
        //当low小于high时循环继续
        while (low<high){
            //首先令最大的与最小的都等于low
            int min = low;
            int max = low;
            //遍历除第一个元素以外的数组找出最大的与最小的
            for(int i = low+1;i<=high;i++){
                //比较两个元素
                if(array[i]<array[min]){
                    //下标
                    min = i;
                }
                if(array[i]>array[max]){
                    max = i;
                }
            }
            swap(array,min,low);
            //如果第一个元素是最大的，交换以后，最大的元素在下标为min的位置处
            if(low == max){
                max = min;
            }
            swap(array,max,high);
            low++;
            high--;
        }
    }
    //快速排序
    public static void quickSort(int[] array){
        quickSortInner(array,0,array.length-1);
    }
    public static void quickSort1(int[] array){
        quickSortInner1(array,0,array.length-1);
    }
    //首先将数组最后一个元素作为基准值，将小于基准值的放左边，大于基准值的放右边，返回基准值的坐标
    //然后区间分为：[left,indexPartition-1]、[indexPartition+1,right]分别递归调用进行排序
    public static void quickSortInner(int[] array,int left,int right){
        //递归结束条件
        if(left>=right){
            return;
        }
        int indexPartition = partition1(array,left,right);
//        int indexPartition = partition2(array,left,right);
//        int indexPartition = partition3(array,left,right);
        quickSortInner(array,left,indexPartition-1);
        quickSortInner(array,indexPartition+1,right);

    }
    public static void quickSortInner1(int[] array,int left,int right){
        //递归结束条件
        if(left>=right){
            return;
        }
        int[] indices = partition4(array,left,right);
        quickSortInner1(array, left, indices[0] - 1);//基准值的下标
        quickSortInner1(array, indices[1] + 1, right);

    }
    //用Hover法找基准值
    public static int partition1(int[] array,int left,int right){
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
    //挖坑法找基准值
    public static int partition2(int[] array,int left,int right){
        //首先定义基准值为数组最后一个元素
        int indexPartition = array[right];
        //定义low指向数组首元素，定义high指向数组尾元素，当low小于high时循环继续
        int low = left;
        int high = right;
        while (low<high){
            while (low<high&&array[low]<=indexPartition){
                low++;
            }
            //循环停止代表array[low]大于indexPartition，则将array[low]赋值给array[high]
            array[high] = array[low];
            while (low<high&&array[high]>=indexPartition){
                high--;
            }
            //循环停止代表array[high]小于indexPartition，则将array[high]赋值给array[low]
            array[low] = array[high];
        }
        array[low] = indexPartition;
        return low;
    }
    //前后下标法
    public static int partition3(int[] array,int left,int right){
        //首先令low为left，基准值为数组最后一个元素
        int low = left;
        int indexPartition = array[right];
        //除了数组最后一个元素以外遍历一遍，将小于基准值的值放在数组的前面，并将low++
        for(int i = left;i<right;i++){
            if(array[i]<indexPartition){
                swap(array,i,low);
                low++;
            }
        }
        //low位置即为基准值位置
        swap(array,right,low);
        array[low] = indexPartition;
        return low;
    }
    //将所有的基准值放到中间处理
    public static int[] partition4(int[] array,int left,int right){
        int low = left;
        int high = right;
        int i = left;
        //令i等于left当i<high时，分为三种情况讨论
        int indexPartition = array[right];
        while (i<high){
            if(array[i]<indexPartition){
                swap(array,i,low);
                low++;
                i++;
            } else if(array[i] == indexPartition){
                i++;
            }else{
                while (i<high&&array[high]>indexPartition){
                    high--;
                }
                swap(array,i,high);
            }
        }
        return new int[]{low,high-1};
    }

    public static void main(String[] args) {
        int[] array = createArray();
        showArray(array);
        System.out.println();
        bubbleSort(array);
        showArray(array);
        System.out.println();
        System.out.println("========================");
        selectSortVersion(array);
        showArray(array);
        System.out.println();
        System.out.println("========================");
        quickSort(array);
        showArray(array);
        System.out.println();
        System.out.println("========================");
        quickSort(array);
        showArray(array);
        System.out.println();
        System.out.println("========================");
        quickSort(array);
        showArray(array);
        System.out.println();
        System.out.println("========================");
        quickSort1(array);
        showArray(array);
        System.out.println();
    }
}
