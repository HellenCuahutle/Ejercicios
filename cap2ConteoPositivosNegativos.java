/*2.32 Escriba un programa que reciba cinco números, y que determine e imprima la cantidad de números negativos,
positivos, y la cantidad de ceros recibidos.*/
package Capitulo2IntroduccionAlasAplicacionesEnJava;

import java.util.Scanner;

public class cap2ConteoPositivosNegativos {

	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int positivo = 0;
		int negativo = 0;
		int cero = 0;
		
		for(int x=0; x <= 5; x++ ) {
			
			System.out.print("Ingrese número: ");
			int num1 = entrada.nextInt();
			
			if(num1 >= 1) {
				
				positivo ++;
				
			}else if(num1 < -0) {
				
				negativo ++;
				
			}else if(num1 == 0) {
				
				cero ++;
			}
			
		}
		
		System.out.print("\nPositivos: " + positivo +	
		                 "\nNegativos: " + negativo +
		                 "\nCero: " + cero);
		
	}
	
}
