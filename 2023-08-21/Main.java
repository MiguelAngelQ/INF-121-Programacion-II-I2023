package Clase21082023;

import java.util.Stack;

public class Main {

	public static void llenar(Stack<Mascota> m, int n) {
		for (int i = 1; i <= n; i++) {
			Mascota x = new Mascota();
			x.leer();
			m.push(x);
		}
	}

	public static void mostrar(Stack<Mascota> m) {
		if (m.isEmpty() == true)
			System.out.println("Pila vacia");
		else {
			Stack<Mascota> aux = new Stack<Mascota>();
			while (!m.isEmpty()) {
				Mascota elem = m.pop();
				aux.push(elem);
				elem.mostrar();
			}
			vaciar(m, aux);
		}
	}

	public static void vaciar(Stack<Mascota> a, Stack<Mascota> b) {
		// la primera pila recibira todos los elementos de la segunda
		while (!b.isEmpty()) {
			a.push(b.pop());
		}
	}

	public static int contarPerros(Stack<Mascota> e) {
		Stack<Mascota> aux = new Stack<Mascota>();
		int cantidad = 0;
		while (!e.isEmpty()) {
			Mascota elem = e.pop();
			aux.push(elem);
			if (elem.getTipo().equals("perro"))
				cantidad = cantidad + 1;
		}
		vaciar(e, aux);
		return cantidad;
	}

	public static void mostrarIesimo(Stack<Mascota> e, int i) {
		if (i == 0 || i > e.size())
			System.out.println("No existe tal mascota");
		else {
			Stack<Mascota> aux = new Stack<Mascota>();
			vaciar(aux, e);
			int cont = 1;
			while (!aux.isEmpty()) {
				Mascota elem = aux.pop();
				e.push(elem);
				if (cont == i)
					elem.mostrar();
				cont = cont + 1;
			}
		}
	}

	public static void mostrarKPrimeros(Stack<Mascota> e, int k) {
		Stack<Mascota> aux = new Stack<Mascota>();
		vaciar(aux, e);
		int cont = 1;
		while (!aux.isEmpty()) {
			Mascota elem = aux.pop();
			e.push(elem);
			if (cont <= k)
				elem.mostrar();
			cont = cont + 1;
		}
	}

	public static void mostrarKUltimos(Stack<Mascota> e, int k) {
		Stack<Mascota> aux = new Stack<Mascota>();
		int dif = e.size() - k;
		vaciar(aux, e);
		int cont = 1;
		while (!aux.isEmpty()) {
			Mascota elem = aux.pop();
			e.push(elem);
			if (cont > dif)
				elem.mostrar();
			cont = cont + 1;
		}
	}

	public static void llevarAlPrincipioLosKUltimos(Stack<Mascota> e, int k) {
		Stack<Mascota> aux = new Stack<Mascota>();
		Stack<Mascota> aux2 = new Stack<Mascota>();
		int dif = e.size() - k;
		vaciar(aux, e);
		int cont = 1;
		while (!aux.isEmpty()) {
			Mascota elem = aux.pop();
			if (cont > dif)
				aux2.push(elem);
			else
				e.push(elem);

			cont = cont + 1;
		}
		vaciar(aux, e);
		vaciar(e, aux2);
		vaciar(e, aux);
	}

	public static void main(String[] args) {
		// una pila de mascotas y mostrar
		Stack<Mascota> a = new Stack<Mascota>();
		int n = Leer.datoInt();
		llenar(a, n);
		mostrar(a);
		System.out.println("-----------------");
		// 1. contar cuantos perros existen en la pila
		System.out.println("Existen " + contarPerros(a) + " perros");
		System.out.println("-----------------");
		// 2. mostrar a la i-esima mascota
		mostrarIesimo(a, 3);
		System.out.println("-----------------");
		// 3. Mostrar las primeras k mascotas
		mostrarKPrimeros(a, 3);
		System.out.println("-----------------");
		// 4. Mostrar las ultimas k mascotas
		mostrarKUltimos(a, 3);
		// 5. Llevar al principio las ultimas k mascotas
		System.out.println("-----------------");
		llevarAlPrincipioLosKUltimos(a, 3);
		mostrar(a);
	}

}
