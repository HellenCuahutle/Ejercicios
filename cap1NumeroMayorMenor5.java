import java.util.Scanner;

/*2.24 Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros mayor y menor en el grupo.
Use solamente las técnicas de programación que aprendió en este capítulo.*/

public class cap1NumeroMayorMenor5 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese primer numero entero: ");
		int num1 = entrada.nextInt();

		System.out.print("Ingrese segundo numero entero: ");
		int num2 = entrada.nextInt();

		System.out.print("Ingrese tercer numero entero: ");
		int num3 = entrada.nextInt();

		System.out.print("Ingrese cuarto numero entero: ");
		int num4 = entrada.nextInt();

		System.out.print("Ingrese quinto numero entero: ");
		int num5 = entrada.nextInt();

		int mayor = num1;
		int menor = num1;

		// Determinar el mayor
		if (num2 > mayor)
			mayor = num2;
		if (num3 > mayor)
			mayor = num3;
		if (num4 > mayor)
			mayor = num4;
		if (num5 > mayor)
			mayor = num5;

		// Determinar el menor
		if (num2 < menor)
			menor = num2;
		if (num3 < menor)
			menor = num3;
		if (num4 < menor)
			menor = num4;
		if (num5 < menor)
			menor = num5;
		
		
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero mayor es: " + menor);

	}

}
