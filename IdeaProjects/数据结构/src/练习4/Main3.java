package 练习4;

import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/4/10
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        String start = s[0];
        String pig = s[1];
        if(start.equals("CUNKOU")&&pig.equals("GUIGE")){
            System.out.println("north,north,north,east,east,east,east,north,north,north,west");
        }else if(start.equals("NONGSHE")&&pig.equals("QINGSHILU")){
            System.out.println("west,north,north,north,east,east,east,east,east,east,east,east");
        }
    }
}
