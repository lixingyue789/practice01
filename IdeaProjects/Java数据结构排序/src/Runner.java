import java.util.Arrays;
import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/9/3
 */
public class Runner {
    private static final Sorts[] sorts = {new selectSort()};
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("需要指定序列的顺序以及数据量的大小");
            return;
        }
        String order = args[0];
        int size = Integer.parseInt(args[1]);
        int[] array;
        if(order.equals("顺序")){
            array = buildOrderArray(size);
        }else if(order.equals("逆序")){
            array = buildReverseArray(size);
        }else {
            array = buildRandomArray(size);
        }
        testSort(array);
    }
    public static int[] buildOrderArray(int size){
        int[] array = new int[size];
        for(int i = 0;i<size;i++){
            array[i] = i;
        }
        return array;
    }
    public static int[] buildReverseArray(int size){
        int[] array = new int[size];
        for(int i = size;i>0;i--){
            array[i] = i;
        }
        return array;
    }
    public static int[] buildRandomArray(int size){
        int[] array = new int[size];
        Random random = new Random(20190903);
        for(int i = 0;i<size;i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void testSort(int[] origin){
        for(Sorts sort:sorts){
            int[] array = Arrays.copyOf(origin,origin.length);
            long begin = System.nanoTime();
            sort.sort(array);
            long end = System.nanoTime();
            int[] second = Arrays.copyOf(origin,origin.length);
            Arrays.sort(second);
            if(!Arrays.equals(array,second)){
                System.out.println("排序错误");
            }
            System.out.printf("%s: 排序消耗的时间是: %.4f 毫秒%n",
                    sort.name(), (end - begin) * 1.0 / 1000 / 1000);
        }
    }
}
