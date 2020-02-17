import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/2/12
 */
public class Main {
    public static String Solution(String a){
        String result = "";
        int max = 0;
        for(int i = 0;i<a.length();i++){
            char b = a.charAt(i);
            if(b>='0'&&b<='9') {
                max=1;
                int index = i;
                for (int j = i + 1; j < a.length(); j++) {
                    char c = a.charAt(j);
                    if (c >= '0' && c <= '9') {
                        max++;
                        index = j;
                    } else {
                        break;
                    }
                }
                if(max>result.length()){
                    result = a.substring(i,index+1);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = Solution(a);
        System.out.println(b);
    }
}
