package CLASE1LAB;

import java.util.*;

public class Tiempos {
	public static void main(String[] args) {

		int instanciaMaxima = 1000000;
		long tiempoInicio, tiempoFin, tiempoTotal;
		tiempoInicio = System.currentTimeMillis();

		// Algoritmo.

		// Fin de algoritmo

		tiempoFin = System.currentTimeMillis();
		tiempoTotal = tiempoFin - tiempoInicio;
		System.out.println("Tiempo de proceso " + tiempoTotal);
	}
}
