import java.util.Scanner;

/**
 * Author:lxy1999
 * Created:2019/5/24
 * 错误
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            StringBuilder s3 = new StringBuilder();

            StringBuilder s4 = new StringBuilder();


            int j = 0;
            if (s1.contains(s2)) {
                for (int i = 0; i < s1.length() && j < s2.length(); i++, j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        s3 =s3.append(s1.charAt(i));
                    }
                }
            }
            for (int i = j = 0; i < s1.length() && j < s3.length(); i++, j++) {
                if (s1.charAt(i) != s3.charAt(j)) {
                    s4=s4.append(s1.charAt(i));
                }
            }

            System.out.println(s4);
            break;
      }

    }
}
