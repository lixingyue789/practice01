import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2019/8/11
 */
public class ArrayList {
    private int size = 0;
    private int[] array;

    public ArrayList(){
        array = new int[10];
    }

    public ArrayList(int[] array) {
        this.array = new int[array.length];
        //把传入的数组的所有元素copy到属性array中
        for (int i = 0; i < array.length; i++) {
            this.array[i] = array[i];
        }
        //更新size
        size = array.length;
    }

    private void ensureCapacity(){
        if(size<array.length){
            return;
        }
        //扩容
        int oldCapacity = array.length;
        int newCapacity = 2*oldCapacity;
        int[] newArray = new int[newCapacity];
        //搬家
        for(int i = 0;i<size;i++){
            newArray[i] = array[i];
        }
        //新地址
        array = newArray;
    }

    //将element插入到index所在的下标下
    //对index做合法性校验
    public void insert(int index, int element) {
        if(index<0||index>size){
            System.out.println("插入位置不合法");
            return;
        }
        ensureCapacity();
        //倒着遍历
        for(int i = size-1 ;i>= index;i--){
            array[i+1] =array[i];
        }
        array[index] = element;
        size++;
    }

    //删除index下标处的元素，要求对index做合法性校验
    public void delect(int index) {
        if(index<0||index>=size){
            System.out.println("输入位置不合法");
            return;
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        ArrayList arrayList = new ArrayList(array);
        System.out.println(arrayList.toString());
        arrayList.insert(5,100);
        System.out.println(arrayList.toString());
        arrayList.delect(2);
        System.out.println(arrayList.toString());
    }
}

