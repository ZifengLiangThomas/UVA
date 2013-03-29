/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class Acm11616 {

    enum Numeral {

        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
        int weigth;

        Numeral(int weigth) {
            this.weigth = weigth;
        }
    };
    /**
     * This method convert decimal number to roman.
     * throws IllegalException if number<=0
     * @param decimal number.
     * @return roman digits.
     */
    public static String decNumberToRoman(long n) {

        if (n <= 0) {
            throw new IllegalArgumentException();
        }
                
        StringBuilder buf = new StringBuilder();

        final Numeral[] values = Numeral.values();
       /**
        * As roman digits represents maximum from left so loop will start from bigger to smaller
        */
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].weigth) {
                buf.append(values[i]);
                n -= values[i].weigth;
            }
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        Map<Integer, String> romanMap = new HashMap<Integer, String>();
        Map<String, Integer> arabicMap = new HashMap<String, Integer>();
        for (int i = 1; i < 4000; i++) {
            String rom = decNumberToRoman(i);
            romanMap.put(i, rom);
            arabicMap.put(rom,i);
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            char ch = input.charAt(0);
            if (Character.isDigit(ch)) {
                Integer arabic = Integer.valueOf(input);
                System.out.println(romanMap.get(arabic));
            } else {
                System.out.println(arabicMap.get(input));
            }
        }
    }
}
