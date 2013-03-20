/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recent;

/**
 *
 * @author Masudul Haque
 */
public class p12439 {
    public static void main(String[] args) {
        System.out.println(isLeafYear(1216));
    }
    
    private static boolean isLeafYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
            return true;
        }
        return false;
    }
}
