/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acm11221 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringBuffer sb = new StringBuffer("");
        int cases = Integer.parseInt(br.readLine());
        for (int l = 1; l < cases + 1; l++) {
            StringBuilder m = new StringBuilder(br.readLine());
            StringBuilder temp = new StringBuilder("");
            for (int j = 0; j < m.length(); j++) {
                if (m.charAt(j) >= 'a' && m.charAt(j) <= 'z') {
                    temp.append(m.charAt(j));
                }
            }
            sb.append("Case #").append(l).append(":\n");
            int n = temp.length();
            if (is_Psquare(n)) {
                if (pali(temp.toString())
                        && (temp.toString().equals(reverse(temp.toString())))) {
                    sb.append((int) (Math.floor(Math.sqrt(n) + 0.5))).append("\n");
                } else {
                    sb.append("No magic :(").append("\n");
                }
            } else {
                sb.append("No magic :(").append("\n");
            }
        }
        System.out.print(sb);
    }

    static boolean pali(String s) {

        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {

            if (s.charAt(i) != s.charAt(j)) {

                return false;

            }

        }
        return true;
    }

    static boolean is_Psquare(int x) {
        int root = (int) (Math.floor(Math.sqrt(x) + 0.5));
        return root * root == x;
    }

    static String reverse(String temp) {
        StringBuilder inverse = new StringBuilder("");
        int n = (int) Math.sqrt(temp.length());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse.append(temp.charAt((j * n) + i));
            }
        }
        return inverse.toString();
    }
}