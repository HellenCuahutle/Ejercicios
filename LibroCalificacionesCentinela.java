import java.util.Scanner;

public class LibroCalificacionesCentinela {

	private String nombreDelCurso; // el nombre del curso que representa este LibroCalificaciones

	// el constructor inicializa a nombreDelCurso
	public LibroCalificacionesCentinela(String nombre) {

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
		double promedio;

		// fase de inicialización
		total = 0;
		contadorCalif = 0;

		// pide entrada y lee siguiente calificación del usuario
		System.out.print("Escriba calificacion o -1 para terminar: ");
		calificacion = entrada.nextInt();

		// fase de procesamiento
		while (calificacion != -1) {

			total = total + calificacion;
			contadorCalif = contadorCalif + 1;

			// pide entrada y lee siguiente calificación del usuario
			System.out.print("Escriba calificacion o -1 para terminar: ");
			calificacion = entrada.nextInt();
		} // fin de while

		// fase de terminación
		// si el usuario introdujo por lo menos una calificación...
		if (contadorCalif != 0) {

			promedio = (double) total / contadorCalif;

			// muestra el total y el promedio de las calificaciones
			System.out.printf("\nEl total de las %d calificaciones introducidas es %d\n", contadorCalif, total);
			System.out.printf("\nEl promedio de la clase es %.2f\n", promedio);

		} // fin de if
 else {
			System.out.println("No se introdujeron calificaciones");
		}

	} // fin del método determinarPromedioClase

} // fin de la clase LibroCalificaciones
