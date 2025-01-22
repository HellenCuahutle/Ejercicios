/*2.26 Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e imprima el
resultado. [Sugerencia: use el operador residuo].*/

import java.util.Scanner;

public class cap1Multiplo {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese primer entero: ");
		int num1 = entrada.nextInt();

		System.out.println("Ingrese primer entero: ");
		int num2 = entrada.nextInt();

		int resultado;

		if (num1 % num2 == 0) {

			resultado = num1 / num2;

			System.out.println("El resultado es: " + resultado);
		}else {
			
			System.out.println("No son multiplo");
		}
		
	}

}
