import java.util.ArrayList;
import java.util.Arrays;

/**
 * Author:lxy1999
 * Created:2020/2/12
 */
public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>(k);
        if(k<=input.length){
            for(int i = 0;i<k;i++){
                list.add(input[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] i = {4,5,1,6,2,7,3};
        ArrayList<Integer> list = GetLeastNumbers_Solution(i,4);
        System.out.println(list);
    }
}