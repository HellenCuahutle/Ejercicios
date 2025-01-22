/*2.25 Escriba una aplicación que lea un entero y que determine e imprima si es impar o par. [Sugerencia: use el
operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando se divide
entre 2].*/

import java.util.Scanner;

public class cap1NumeroParImpar {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un número entero: ");
		int numero = entrada.nextInt();

		if (numero % 2 == 0) {

			System.out.println("El número es par ");

		} else

			System.out.println("El número es impar");

	}

}
