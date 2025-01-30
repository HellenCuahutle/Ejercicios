import java.util.Scanner;

public class Analisis {

	public void procesarResultadosExamen() {

		Scanner entrada = new Scanner(System.in);

		int aprobados = 0;
		int reprobados = 0;
		int contadorEstudiantes = 1;
		int resultado;

		while (contadorEstudiantes <= 10) {

			System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
			resultado = entrada.nextInt();

			// if...else anidado en while
			if (resultado == 1) {
				aprobados = aprobados + 1;
			} else {
				reprobados = reprobados + 1;
			}

			// incrementa contadorEstudiantes, para que el ciclo termine en un momento dado
			contadorEstudiantes = contadorEstudiantes + 1;
		} // fin de while

		System.out.printf("Aprobados:  %d\nReprobados: %d\n", aprobados, reprobados);

		// determina si más de 8 estudiantes aprobaron
		if (aprobados > 8) {
			System.out.println("Aumentar colegiatura");
		}
	}// fin del método procesarResultadosExamen

}
