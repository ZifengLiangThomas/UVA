/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class p12405 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new FileInputStream(new File("12405.txt")));
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            int no=Integer.parseInt(sc.nextLine());
            String input = sc.nextLine();
            int min = Integer.MAX_VALUE;
            int count = 0;
            boolean cons=false;
            for (int j = 0; j < no; j++) {
                char ch = input.charAt(j);
                if (ch == '.') {
                    count++;
                    cons=false;
                }
                else if(ch=='#' && count<min && !cons){
                    min=count;
                    count=0;
                    cons=true;
                }
            }
            System.out.println("Case "+(i+1)+": "+min);
        }
    }
}
