/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;


/**
 *
 * @author Masudul Haque
 */
public class Acm11616Test {
    enum Roman{
        i(1),iv(4),v(5);
        int weight;

        private Roman(int weight) {
            this.weight = weight;
        }
    };
    
    static String decToRoman(int dec){
        String roman="";
        Roman[] values=Roman.values();
        for (int i = values.length-1; i>=0; i--) {
           while(dec>=values[i].weight){
               roman+=values[i];
               dec=dec-values[i].weight;
           }            
        }
        return roman;
    }
    public static void main(String[] args) {
        int value=3;
        System.out.println(decToRoman(value));
    }
}