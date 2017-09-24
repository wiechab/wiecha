/**
 * 
 */
package pl.atena.edu.akademia00;

/**
 * @author wieslawab
 *
 */

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class TypBigDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger n = BigInteger.valueOf(8795890099863214L);
		
		BigDecimal bd = BigDecimal.valueOf(879589009.9863214);
		BigDecimal bd_1 = BigDecimal.ONE;
		BigDecimal bd2 = BigDecimal.valueOf(2.22);
				
		BigDecimal r1 = bd.add(bd_1); //dodawanie
		BigDecimal r2 = bd.divide(bd2);//dzielenie
		BigDecimal r3 = bd.multiply(bd2);//mno¿enie
		
		//najwiêkszy wspólny dzielnik
		BigInteger r4 = BigInteger.valueOf(100).gcd(BigInteger.valueOf(8));
		
		
	}

}
