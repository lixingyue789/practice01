package 练习4;

/**
 * Author:lxy1999
 * Created:2020/4/3
 */
public class Main2 {
    public int min_monitors (String inputs) {
        // write code here
        int r = 0;
        for(int i = 0;i<inputs.length();i++){
            char ch = inputs.charAt(i);
            if(ch=='1'){
                r++;
            }
        }
        return r;
    }
}
