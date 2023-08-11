import java.util.Scanner;

public class Celular {
	private String marca, modelo, tamanio, color;
	private int precio, memoria;

	public Celular() {
		marca = "apple";
		modelo = "15 pro";
		tamanio = "mediano";
		precio = 1400;
		memoria = 512;
		color = "silver";
	}

	public Celular(String ma, String mo, String t, int p, int me, String c) {
		marca = ma;
		modelo = mo;
		tamanio = t;
		precio = p;
		memoria = me;
		color = c;
	}

	public void leer() {
		// print("Introduzca marca: ")
		// marca = str(input())
		System.out.println("Introduzca marca: ");
		marca = Leer.dato();
		System.out.println("Introduzca modelo: ");
		modelo = Leer.dato();
		System.out.println("Introduzca tamanio: ");
		tamanio = Leer.dato();
		System.out.println("Introduzca precio: ");
		precio = Leer.datoInt();
		System.out.println("Introduzca memoria: ");
		memoria = Leer.datoInt();
		System.out.println("Introduzca color: ");
		color = Leer.dato();
	}

	public void comparar(Celular v) {
		if (this.getPrecio() == v.getPrecio()) {
			System.out.println("mismo precio");
		} else if (this.getPrecio() > v.getPrecio()) {
			this.mostrar();
			//System.out.println(this.getModelo());
		} else {
			v.mostrar();
			//System.out.println(v.getModelo());
		}
	}
	
	public void intercambiar(Celular r){
		String aux = this.getColor();
		this.setColor(r.getColor());
		r.setColor(aux);
	}	

	public void mostrar() {
		System.out.println(marca + ", " + modelo + ", " + tamanio + ", " + precio + ", " + memoria + ", " + color);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

}
