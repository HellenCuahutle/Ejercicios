import java.util.Scanner;

/*2.17 Escriba una aplicación que reciba tres enteros del usuario y muestre la suma, promedio, producto, menor y
mayor de esos números. Utilice las técnicas que se muestran en la fi gura 2.15. [Nota: el cálculo del promedio en este
ejercicio debe resultar en una representación entera del promedio. Por lo tanto, si la suma de los valores es 7, el promedio debe ser 2, no 2.3333...].*/

public class cap1TresNumeros {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese primer numero entero: ");
		int num1 = entrada.nextInt();

		System.out.print("Ingrese primer numero entero: ");
		int num2 = entrada.nextInt();

		System.out.print("Ingrese primer numero entero: ");
		int num3 = entrada.nextInt();

		int suma = num1 + num2 + num3;
		int promedio = suma / 3;
		int producto = (num1 * num2) * (num3);
		
		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + promedio);
		System.out.println("El producto es: " + producto);

		int mayor = Math.max(num1, Math.max(num2, num3));
		int menor = Math.min(num1, Math.min(num2, num3));

		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);

	}

}
