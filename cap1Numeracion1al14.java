package 1CapituloUno;


/*2.14 Escriba una aplicación que muestre los números del 1 al 4 en la misma línea, con cada par de números adyacentes separado por un espacio. Escriba el programa utilizando las siguientes técnicas:
 a) Utilizando una instrucción System.out.println.
 b) Utilizando cuatro instrucciones System.out.print.
 c) Utilizando una instrucción System.out.printf*/

public class cap1Numeracion1al14 {

	public static void main(String args[]) {

		for (int x = 1; x <= 14; x++) {
			System.out.printf(" " + x);
		}

	}

}
