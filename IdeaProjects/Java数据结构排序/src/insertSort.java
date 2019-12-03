/**
 * Author:lxy1999
 * Created:2019/9/3
 */
public class insertSort implements Sorts {
    @Override
    public String name() {
        return "直接插入排序";
    }

    @Override
    public void sort(int[] array) {
        for(int i = 0;i<array.length-1;i++){
            //有序：[0,i] 无序：[i+1,array.length-1]
            int key = array[i+1];
            int j = 0;
            for(j = i;j>=0;j--){
                if(key>=array[j]){
                    break;
                }
                array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }
}
