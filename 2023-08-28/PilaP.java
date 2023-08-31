package Clase3;

class PilaP {
	private int max = 30;
	private Persona v[] = new Persona[max + 1];
	private int tope;

	PilaP() {
		tope = 0;
	}

	boolean esvacia() {
		if (tope == 0)
			return (true);
		return (false);
	}

	boolean esllena() {
		if (tope == max)
			return (true);
		return (false);
	}

	int nroelem() {
		return (tope);
	}

	void adicionar(Persona elem) {
		if (!esllena()) {
			tope++;
			v[tope] = new Persona();
			v[tope] = elem;
		} else
			System.out.println("Pila llena");
	}

	Persona eliminar() {
		Persona elem = new Persona();
		if (!esvacia()) {
			elem = v[tope];
			tope--;
		} else
			System.out.println("Pila vacia");
		return (elem);
	}

	void mostrar() {
		Persona elem = new Persona();
		if (esvacia())
			System.out.println("Pila vacia");
		else {
			System.out.println("\n Datos de la Pila ");
			PilaP aux = new PilaP();
			while (!esvacia()) {
				elem = eliminar();
				aux.adicionar(elem);
				elem.mostrar();
			}
			this.vaciar(aux);
		}
	}

	void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Persona elem = new Persona();
			elem.leer();
			this.adicionar(elem);
		}
	}

	void vaciar(PilaP a) {
		while (!a.esvacia())
			adicionar(a.eliminar());

	}
}
