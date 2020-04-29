package 练习4;

/**
 * Author:lxy1999
 * Created:2020/4/3
 */

import java.util.*;

public class Main {
    public static boolean Match(String s, String p) {
        // write code here
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < p.length() / 2; i++) {
            char a = p.charAt(i);
            stack.push(a);
        }
        int index = p.length() / 2;
        while (!stack.isEmpty()) {
            char ch = stack.peek();
            char c = 'a';
            if (index < p.length()) {
                c = p.charAt(index);
            }
            if ( c != '*') {
                ch = stack.pop();
            }
            if (ch != '*' && c != '*') {
                map.put(ch, c);
            } else if (ch == '*') {
                char m = stack.peek();
                map.put(ch, m);
            } else {
                char m = p.charAt(index - 1);
                map.put(m, '*');
            }
            index++;
        }
        for(Map.Entry<Character,Character> m:map.entrySet()){
            char k = m.getKey();
            char v = m.getValue();
            System.out.println(k+" "+v);
        }
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length() / 2; i++) {
            char a = s.charAt(i);
            s1.push(a);
        }
        int len = s.length() / 2;
        int l = 0;
        while (!s1.isEmpty()) {
            char ch = s1.pop();
            char c = 'a';
            if (len < s.length()) {
                c = s.charAt(len);
            }
            if (map.containsKey(ch)) {
                char o = map.get(ch);
                if (o == c) {
                    l++;
                }
            }
            len++;
        }
        if (l == s.length() / 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(",");
        String a = s[0].substring(1, s[0].length() - 1);
        String p = s[1].substring(1, s[1].length() - 1);
        boolean r = Match(a, p);
        System.out.println(r);
    }
}
