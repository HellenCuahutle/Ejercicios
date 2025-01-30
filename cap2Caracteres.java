/*2.29 Observe que el especifi cador de formato %c es un receptáculo para un carácter (en este
caso, el carácter 'A').
 Utilizando instrucciones similares a la mostrada anteriormente en este ejercicio, escriba una aplicación que
muestre los equivalentes enteros de algunas letras en mayúsculas, en minúsculas, dígitos y símbolos especiales.
Muestre los equivalentes enteros de los siguientes caracteres: A B C a b c 0 1 2 $ * + / y el carácter en
blanco.*/
package Capitulo2IntroduccionAlasAplicacionesEnJava;

public class cap2Caracteres {

	public static void main(String arsg[]) {

		System.out.printf("El caracter %c tiene el valor %d\n", 'A', ((int) 'A'));

		System.out.printf("El caracter %c tiene el valor %d\n", 'B', ((int) 'B'));

		System.out.printf("El caracter %c tiene el valor %d\n", 'C', ((int) 'C'));

		System.out.printf("El caracter %c tiene el valor %d\n", 'a', ((int) 'a'));

		System.out.printf("El caracter %c tiene el valor %d\n", 'b', ((int) 'b'));

		System.out.printf("El caracter %c tiene el valor %d\n", 'c', ((int) 'c'));

		System.out.printf("El caracter %c tiene el valor %d\n", ' ', ((int) ' '));

		System.out.printf("El caracter %c tiene el valor %d\n", '*', ((int) '*'));

		System.out.printf("El caracter %c tiene el valor %d\n", '/', ((int) '/'));
	}

}
