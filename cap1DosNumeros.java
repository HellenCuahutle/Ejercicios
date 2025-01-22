/*2.16 Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario y
muestre el número más grande, seguido de las palabras "es más grande". Si los números son iguales, imprima el
mensaje "Estos números son iguales". Utilice las técnicas que se muestran en la fi gura 2.15.*/

import java.util.Scanner;

public class cap1DosNumeros {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese primer número entero: ");
		int numero1 = entrada.nextInt();

		System.out.print("Ingrese segundo número entero: ");
		int numero2 = entrada.nextInt();

		if (numero1 > numero2) {

			System.out.print("El número " + numero1 + " es más grande");

		} else if (numero2 > numero1) {

			System.out.print("El número " + numero2 + " es más grande");

		} else {

			System.out.print("Estos números son iguales 20" + numero1 + " & " + numero2);
		}

	}

}
