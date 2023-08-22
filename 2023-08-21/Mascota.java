package Clase21082023;

public class Mascota {

	private String nombre, tipo;
	private int edad;

	public Mascota() {
		nombre = "Fido";
		tipo = "perro";
		edad = 1;
	}

	public void leer() {
		System.out.println("Introduzca nombre: ");
		nombre = Leer.dato();
		System.out.println("Introduzca tipo: ");
		tipo = Leer.dato();
		System.out.println("Introduzca edad: ");
		edad = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println(nombre + " " + tipo + " " + edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
