package estructuras;

import java.util.Scanner;

public class Condicionales {

	public static void ejemplosIf1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		} else {
			System.out.println("Hola " + nombre);
		}
		sc.close();
	}

	public static void ejemplosIf2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		if (nombre.equals("")) {
			System.out.println("¡El nombre no puede estar vacío!");
		} else if (nombre.length()==1) {
				System.out.println("¿No es un nombre muy corto?");
		} else {
			System.out.println("Hola " + nombre);
		}
		sc.close();
	}

	public static void ternario1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println(nombre.equals("")?"El nombre no puede estar vacío":"Hola " + nombre);
// Esto se utiliza para sustituir el if if else, los dos puntos significa "si no"
//... ? ... : ... --> se cumple tal cosa? si, haz lo siguiente : si no haz lo otro
		sc.close();
	}
	

	
	public static void main(String[] args) {
//		ejemplosIf1();
//		ejemplosIf2();
		ternario1();

	}

}
