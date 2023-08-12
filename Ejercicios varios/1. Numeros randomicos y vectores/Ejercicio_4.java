package CLASE1LAB;

import java.util.Collections;
import java.util.Vector;

public class Ejercicio_4 {
	public static void main(String[] args) {

		int instanciaMaxima = 1000000;
		long tiempoInicio, tiempoFin, tiempoTotal;
		tiempoInicio = System.currentTimeMillis();

		// ORDENAR EL VECTOR DEL PUNTO 2
		// Algoritmo.
		int n = 1000;
		Vector<Integer> A = new Vector<Integer>();
		for (int i = 1; i <= n; i++) {
			int random = (int) (Math.random() * 100);
			A.add((int) (random));
		}

        System.out.println("ORDENANDO EL VECTOR");
        Collections.sort(A);
        System.out.println(A);

		// Fin de algoritmo

		tiempoFin = System.currentTimeMillis();
		tiempoTotal = tiempoFin - tiempoInicio;
		System.out.println("Tiempo de proceso " + tiempoTotal);
	}
}
