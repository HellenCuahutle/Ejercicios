/*Utilizando sólo las técnicas de programación que aprendió en este capítulo, escriba una aplicación que calcule
los cuadrados y cubos de los números del 0 al 10, y que imprima los valores resultantes en formato de tabla, como se
muestra a continuación. [Nota: Este programa no requiere de ningún tipo de entrada por parte del usuario].
*/
package Capitulo2IntroduccionAlasAplicacionesEnJava;

public class cap2CuadradosCubos0al10 {

	public static void main(String args[]) {

		System.out.println("Número\tCuadrado\tCubo");
		for (int x = 0; x <= 10; x++) {

			int cuadrado = x * x;
			int cubo = x * x * x;

			System.out.printf("\n%d\t\t%d\t\t%d\n", x, cuadrado, cubo);

		}

	}

}
