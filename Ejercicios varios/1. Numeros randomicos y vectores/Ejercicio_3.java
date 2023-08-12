package CLASE1LAB;

import java.util.Vector;

public class Ejercicio_3 {
	public static void main(String[] args) {

		int instanciaMaxima = 1000000;
		long tiempoInicio, tiempoFin, tiempoTotal;
		tiempoInicio = System.currentTimeMillis();

		// Generar numro randomicos entros de 0 a 10 y contar los menores a 5
		// Algoritmo.
		int n = 1000;
		int contador = 0;
		Vector<Integer> A = new Vector<Integer>();
		for (int i = 1; i <= n; i++) {
			int random = (int) (Math.random() * 10);
			if (random < 5) {
				contador++;
			}
		}
		System.out.println("Los numeros menores a 5 son: " + contador);

		// Fin de algoritmo

		tiempoFin = System.currentTimeMillis();
		tiempoTotal = tiempoFin - tiempoInicio;
		System.out.println("Tiempo de proceso " + tiempoTotal);
	}
}
