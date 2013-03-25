/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.io.*;
public class Acm113 {
	public static void main(String[] args) throws Throwable {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = in.readLine();
			if (str == null || str.equals(""))
				break;
			int n = Integer.parseInt(str.trim());
			double x = Double.parseDouble(in.readLine().trim());
                        
			System.out.println(Math.round(Math.pow(x, 1.0/n)));
		}
           
	}
}
