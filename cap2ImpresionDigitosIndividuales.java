package Capitulo2IntroduccionAlasAplicacionesEnJava;
import java.util.Scanner;

public class cap2ImpresionDigitosIndividuales {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite un valor de 5 digitos: ");

		String numero = entrada.nextLine();

		if (numero.length() == 5 & numero.matches("\\d+")) {

			String resultado = String.join("   ", numero.split(""));

			System.out.println("\nResultado:");
			System.out.println(resultado);

		} else {

			System.out.println("El número es mayor");
		}

		System.out.println("");

	}

}
