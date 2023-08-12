package CLASE1LAB;

import java.util.Vector;

public class Ejercicio_2 {
	public static void main(String[] args) {

		int instanciaMaxima = 1000000;
		long tiempoInicio, tiempoFin, tiempoTotal;
		tiempoInicio = System.currentTimeMillis();

		// En un vector almacenar números randomicos enteros del
		// 0 al 100, ¿Cuantas veces se repite el primer elemento?

		// Algoritmo.
		int n = 1000;
		Vector<Integer> A = new Vector<Integer>();
		for (int i = 1; i <= n; i++) {
			int random = (int) (Math.random() * 100);
			A.add((int) (random));
		}

		int contador = 0;
		for (int i = 0; i < A.size(); i++) {
			if (A.firstElement().equals(A.get(i))) {
				contador++;
			}
		}
		System.out.println(A);
		System.out.println("Se repite el: " + A.firstElement() + " :" + contador + " veces");

		// Fin de algoritmo

		tiempoFin = System.currentTimeMillis();
		tiempoTotal = tiempoFin - tiempoInicio;
		System.out.println("Tiempo de proceso " + tiempoTotal);
	}
}
