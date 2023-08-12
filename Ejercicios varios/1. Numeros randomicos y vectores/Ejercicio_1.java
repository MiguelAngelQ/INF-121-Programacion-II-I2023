package CLASE1LAB;

public class Ejercicio_1 {
	public static void main(String[] args) {

		int instanciaMaxima = 1000000;
		long tiempoInicio, tiempoFin, tiempoTotal;
		tiempoInicio = System.currentTimeMillis();

		// Generar numeros randomicos y encontrar el mayor
		// Algoritmo.
		int n = 1000;
		int maximo = 0;
		for (int i = 1; i <= n; i++) {
			// genera números entre 1 y 100
			int random = (int) (Math.random() * 100);
			if (maximo < random)
				maximo = random;
		}
		System.out.println("El maximo es: " + maximo);

		// Fin de algoritmo

		tiempoFin = System.currentTimeMillis();
		tiempoTotal = tiempoFin - tiempoInicio;
		System.out.println("Tiempo de proceso " + tiempoTotal);
	}
}
