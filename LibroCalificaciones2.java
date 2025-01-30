import java.util.Scanner;

public class LibroCalificaciones2 {

	private String nombreDelCurso; // el nombre del curso que representa este LibroCalificaciones

	// el constructor inicializa a nombreDelCurso
	public LibroCalificaciones2(String nombre) {

		nombreDelCurso = nombre;
	}

	// método para establecer el nombre del curso
	public void establecerNombreDelCurso(String nombre) {
		nombreDelCurso = nombre;
	}

	// método para obtener el nombre del curso
	public String obtenerNombreDelCurso() {

		return nombreDelCurso;
	}

	// muestra un mensaje de bienvenida al usuario de LibroCalificaciones
	public void mostrarMensaje() {

		System.out.printf("Bienvenido al libro de calificaciones para\n%s!\n\n", obtenerNombreDelCurso());
	}

	// determina el promedio de la clase, con base en las 10 calificaciones
	// introducidas por el usuario
	public void determinarPromedioClase() {

		Scanner entrada = new Scanner(System.in);

		int total; // suma de las calificaciones escritas por el usuario
		int contadorCalif; // número de la siguiente calificación a introducir
		int calificacion;
		int promedio;

		// fase de inicialización
		total = 0;
		contadorCalif = 1;

		// fase de procesamiento
		while (contadorCalif <= 10) {

			System.out.print("Escriba la calificacion: "); // indicador
			calificacion = entrada.nextInt();
			total = total + calificacion; // suma calificación a total
			contadorCalif = contadorCalif + 1; // incrementa contador en 1

		}

		promedio = total / 10; // la división entera produce un resultado entero

		// muestra el total y el promedio de las calificaciones
		System.out.printf("\nEl total de las calificaciones es %d\n", total);
		System.out.printf("\nEl promedio de la clase es %d\n", promedio);
	} // fin del método determinarPromedioClase

} // fin de la clase LibroCalificaciones
