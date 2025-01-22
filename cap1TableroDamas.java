/*2.27 Escriba una aplicación que muestre un patrón de tablero de damas, como se muestra a continuación:*/

public class cap1TableroDamas {

	public static void main(String args[]) {

		for (int x = 0; x < 8; x++) {

			for (int z = 0; z < 16; z++) {

				if ((x + z) % 2 == 0) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}

			}

			System.out.println("");
		}

	}

}
