package ejercicios2;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicios2 {

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int numero = sc.nextInt();
		System.out.println((numero % 10 == 0) ? "El número es divisible por 10" 
				:"El número no es divisible por 10");
		sc.close();
	}
	
	public static void ejercicio3() throws IOException {
		System.out.print("Escribe una letra y pulsa enter: ");
		char letra = (char) System.in.read();
		System.out.println((letra == Character.toUpperCase(letra)) ? "la letra '" + letra + "' es mayúscula"
				: "No es mayúscula");
	}
	
	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una palabra: ");
		String palabra1 = sc.nextLine();
		System.out.print("Escribe otra palabra: ");
		String palabra2 = sc.nextLine();

//		if (palabra1.equals(palabra2)) {
//			System.out.println("Las palabras son iguales");
//		} else {
//			System.out.println("Las palabras son distintas");
//		}
		System.out.println((palabra1.equals(palabra2) ? "Las palabras son iguales"
				: "Las palabras son distintas"));
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		//ejercicio2();
		//ejercicio3();
		ejercicio4();

	}

}
