package 练习1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2020/3/9
 */
public class Main11 {
    public static boolean Solution(List<Integer> list) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            sum = sum + a;
            if (a > max) {
                max = a;
            }
        }
        sum = sum - max;
        if (sum > max) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = Integer.parseInt(line);
        String[] array = new String[count];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            String a = array[i];
            String[] b = a.split(" ");
            int x = Integer.parseInt(b[0]);
            int y = Integer.parseInt(b[1]);
            if (x == 1) {
                list.add(y);
            } else {
                if (list.contains(y)) {
                    list.remove(new Integer(y));
                } else {
                    System.out.println("No");
                }
            }
            if (!list.isEmpty()) {
                if (x == 1) {
                    boolean r1 = Solution(list);
                    if (r1) {
                        System.out.println("Yes");

                    } else {
                        System.out.println("No");

                    }
                } else {
                    boolean r2 = Solution(list);
                    if (r2) {
                        System.out.println("Yes");

                    } else {
                        System.out.println("No");
                    }

                }
            } else {
                System.out.println("No");
            }
        }
    }
}
