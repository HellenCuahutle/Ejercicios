/*2.15 Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números del usuario e
imprima la suma, producto, diferencia y cociente (división) de los números. Use las técnicas que se muestran en la
figura 2.7.*/

/*La diferencia entre dos números es el resultado de restar el número menor del mayor. */

import java.util.Scanner;

public class cap1SumaDosNumeros {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		int numero1 = entrada.nextInt();

		System.out.print("Ingrese un segundo número: ");
		int numero2 = entrada.nextInt();

		int suma = numero1 + numero2;
		int producto = numero1 * numero2;
		int diferencia;
		int cociente = numero1 / numero2;

		if (numero1 < numero2) {

			diferencia = numero2 - numero1;

		} else {

			diferencia = numero1 - numero2;
		}

		System.out.println("La suma es: " + suma +
				           "\nEl producto es:" + producto +
				           "\nLa diferencia es: " + diferencia +
				           "\nEl cociente es: " + cociente);
	}

}
