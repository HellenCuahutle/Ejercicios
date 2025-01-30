/*Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima el diámetro, la circunferencia y el área del círculo mediante el
uso del valor de punto fl otante 3.14159 para π.
diámetro = 2r
 circunferencia = 2πr
 área = πr 2*/

/*No almacene los resultados de cada cálculo en una variable. En vez de ello, especifi que cada cálculo como el valor
que se imprimirá en una instrucción System.out.printf. */
package Capitulo2IntroduccionAlasAplicacionesEnJava;

import java.util.Scanner;

public class cap2CirculoOperacion {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el valor radio del circulo: ");
		int radio = entrada.nextInt();

		System.out.println("El diametro del circulo es : " + radio * 2);
		System.out.println("La circunferencia del circulo es : " + Math.PI * (radio * 2));
		System.out.println("El área del círculo es:  " + Math.PI * Math.pow(radio, 2));

	}

}
