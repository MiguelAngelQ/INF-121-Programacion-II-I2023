
public class Main {

	public static void main(String[] args) {
		// dados 2 celulares mostrar el de mayor precio
		Celular a = new Celular("xioami", "xs", "grande", 1000, 64, "blanco");
		Celular b = new Celular();
		b.leer();
		
		a.mostrar();
		b.mostrar();
		/*opcion 1
		if (a.getPrecio() == b.getPrecio()) {
			System.out.println("Mismo precio");
		} else if (a.getPrecio() > b.getPrecio()) {
			a.mostrar();
		} else {
			b.mostrar();
		}*/
		//opcion 2
		a.comparar(b);
		
		//dados 2 celulares intercambiar los colores
		a.intercambiar(b);
		a.mostrar();
		b.mostrar();
	}

}
