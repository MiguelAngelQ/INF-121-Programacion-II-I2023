package Clase3;

public class Persona {
	private String nombre;
	private int ci, edad;

	public Persona() {
		nombre = "Juan Perez Perez";
		ci = 12345678;
		edad = 45;
	}

	public void leer() {
		System.out.println("Introduzca nombre, ci y edad");
		nombre = Leer.dato();
		ci = Leer.datoInt();
		edad = Leer.datoInt();
	}

	public void mostrar() {
		System.out.println(nombre + ", " + ci + ", " + edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
