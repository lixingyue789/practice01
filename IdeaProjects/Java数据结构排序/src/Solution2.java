import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Author:lxy1999
 * Created:2019/9/2
 */
public class Solution2 {

    public static void swap(Person[] array,int a,int b){
        Person temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    //引入接口comparable使得天然自身有序
    public static void bubbleSort(Person[] array){
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-i-1;j++){
                int result = array[j].compareTo(array[j+1]);
                if(result>0){
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void bubbleSort1(Person[] array, Comparator<Person> comparator){
        for(int i = 0;i<array.length-1;i++){
            for(int j = 0;j<array.length-i-1;j++){
                int result = comparator.compare(array[j],array[j+1]);
                if(result>0){
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Person[] person = new Person[20];
        Random random = new Random(20190902);
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
            person[i].age = random.nextInt(100);
            person[i].rank = random.nextInt(50);
        }

        System.out.println(Arrays.toString(person));
//        for(int i = 0;i<person.length;i++){
//            person[i].getInfo();
//        }
        bubbleSort(person);
        bubbleSort1(person,new personRankComparator());
        System.out.println(Arrays.toString(person));
    }
}
