/**
 * 
 */
package pl.atena.edu.akademia00;

import java.util.Scanner;

/**
 * @author wieslawab
 *
 */
public class Pole {

	/**
	 * @param args
	 */
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj wartoœæ boku a:  ");
		String sa = scanner.nextLine();
		
		System.out.println("Podaj wartoœæ boku b:  ");
		String sb = scanner.nextLine();
		
		int ia = Integer.valueOf(sa);
		int ib = Integer.valueOf(sb);
		System.out.println(ia*ib);
		
		/*
		
		int bokA = 10;
		int bokB = 2;
		
		int pole = Math.multiplyExact(bokA,bokB);
		System.out.println(pole);
		
		
		 bokA = 10;
		 bokB = 2;
		System.out.println(bokA * bokB);
		*/
	}

}
