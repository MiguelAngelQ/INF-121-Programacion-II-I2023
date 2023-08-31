package Clase3;

public class Main {

	public static void invertir(PilaP e) {
		PilaP aux1 = new PilaP();
		PilaP aux2 = new PilaP();
		aux1.vaciar(e);
		aux2.vaciar(aux1);
		e.vaciar(aux2);
	}

	public static void intercambiar(PilaP e) {
		PilaP aux = new PilaP();
		Persona f = new Persona();
		f = e.eliminar();
		aux.vaciar(e);
		e.adicionar(f);
		f = aux.eliminar();
		e.vaciar(aux);
		e.adicionar(f);
	}

	public static void ordenar(PilaP r) {
		PilaP aux1 = new PilaP();
		PilaP aux2 = new PilaP();
		while (!r.esvacia()) {
			Persona mayor = new Persona();
			mayor = r.eliminar();
			while (!r.esvacia()) {
				Persona b = new Persona();
				b = r.eliminar();
				if (b.getEdad() > mayor.getEdad()) {
					aux1.adicionar(mayor);
					mayor = b;
				} else {
					aux1.adicionar(b);
				}
			}
			aux2.adicionar(mayor);
			r.vaciar(aux1);
		}
		r.vaciar(aux2);
	}

	public static void intercambiar2(PilaP a, PilaP b) {
		PilaP aux1 = new PilaP();
		PilaP aux2 = new PilaP();
		Persona e1 = a.eliminar();
		Persona e2 = b.eliminar();
		aux1.vaciar(a);
		aux2.vaciar(b);
		a.adicionar(e2);
		b.adicionar(e1);
		e1 = aux1.eliminar();
		e2 = aux2.eliminar();
		a.vaciar(aux1);
		b.vaciar(aux2);
		a.adicionar(e2);
		b.adicionar(e1);
	}

	public static void eliminarMayores(PilaP a, int edad) {
		PilaP aux = new PilaP();
		aux.vaciar(a);
		while (!aux.esvacia()) {
			Persona x = aux.eliminar();
			if (x.getEdad() <= edad)
				a.adicionar(x);
		}
	}

	public static void eliminarKEsimo(PilaP a, int k) {
		if (a.nroelem() >= k) {
			PilaP aux = new PilaP();
			aux.vaciar(a);
			int contador = 1;
			while (!aux.esvacia()) {
				Persona t = aux.eliminar();
				if (contador != k) {
					a.adicionar(t);
				}
				contador += 1;
			}
		} else {
			System.out.println("Error");
		}
	}

	public static void insertar(PilaP a, int i) {
		if (a.nroelem() >= i) {
			int k = a.nroelem() - i;
			PilaP aux = new PilaP();
			for (int j = 1; j <= k; j++) {
				// aux.adicionar(a.eliminar());
				Persona w = a.eliminar();
				aux.adicionar(w);
			}
			Persona nuevo = new Persona();
			nuevo.leer();
			a.adicionar(nuevo);
			a.vaciar(aux);
		} else {
			System.out.println("No es posible");
		}
	}

	public static void main(String[] args) {
		PilaP a = new PilaP();
		a.llenar(Leer.datoInt());
		a.mostrar();
		// ejercicio a: Invertir el orden de la pila.
		invertir(a);
		a.mostrar();
		// ejercicio b: Intercambiar el primer y ultimo elemento de la pila.
		intercambiar(a);
		a.mostrar();
		// ejercicio c: Ordenar la pila de acuerdo a la edad.
		ordenar(a);
		a.mostrar();
		// ejercicio d:
		/*
		 * Dadas 2 pilas: a y b intercambiar el primer elemento de $a$ con el último
		 * elemento de b, tambien intercambiar el primer elemento de $b$ con el último
		 * elemento de a.
		 */
		PilaP b = new PilaP();
		b.llenar(Leer.datoInt());
		b.mostrar();
		intercambiar2(a, b);
		a.mostrar();
		b.mostrar();
		// ejercicio e: Dada una pila, eliminar a las personas mayores de x años.
		eliminarMayores(a, 18);
		a.mostrar();
		// ejercicio f: Dada una pila, eliminar a la k-ésima persona de esta.
		eliminarKEsimo(a, 3);
		a.mostrar();
	}
}
