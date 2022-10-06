package ejercicios2;

import java.io.IOException;
import java.util.Random;
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
	
	public static void dowhile1() {
		Scanner sc = new Scanner(System.in);
		int adivina = new Random().nextInt(10) + 1;
		//int adivina = 7;
		int intentos = 0;
		int num=-1;
		do {System.out.print("Adivina el número del 1 al 10 (te quedan " + (3-intentos) + " "
					+ (((3-intentos)==1)?"intento)":"intentos): "));
			num = sc.nextInt();
			if (adivina!=num) {
				System.out.println("Has fallado!");
			}
			intentos++;
		} while (adivina != num && intentos < 3);
		if (adivina==num) {
			System.out.println("Has acertado!");
		} else {
			System.out.println("Te has quedado sin intentos");
		}
		sc.close();
	}
	
	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		int op = -1;
		int num1=0, num2=0;
		
		while(op!=0) {
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			op = sc.nextInt();
			
			switch(op) {
				case 1: 
					System.out.println("Introduzca dos números para sumar");
					System.out.println("Número 1: ");
					num1 = sc.nextInt();
					System.out.println("Número 2: ");
					num2 = sc.nextInt();
					System.out.println("El resultado es: " + (num1 + num2));
					break;
				case 2:
					System.out.println("Introduzca dos números para restar");
					System.out.println("Número 1: ");
					num1 = sc.nextInt();
					System.out.println("Número 2: ");
					num2 = sc.nextInt();
					System.out.println("El resultado es: " + (num1 - num2));
					break;
				case 3:
					System.out.println("Introduzca dos números para multiplicar");
					System.out.println("Número 1: ");
					num1 = sc.nextInt();
					System.out.println("Número 2: ");
					num2 = sc.nextInt();
					System.out.println("El resultado es: " + (num1 * num2));
					break;
				case 4:
					while(num2==0) {
						System.out.println("Introduzca dos números para dividir");
						System.out.println("Número 1: ");
						num1 = sc.nextInt();
						System.out.println("Número 2: ");
						num2 = sc.nextInt();
						if(num2!=0)
						System.out.println("El resultado es: " + (num1 / num2));
						else {
							System.out.println("El número 2 no puede ser cero");
						}
					}
				default:
					System.out.println("Introduce una opción válida");
					break;
				case 0: 
					break;
			}
		}
		
		sc.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//dowhile1();
		ejercicio11();

	}

}
