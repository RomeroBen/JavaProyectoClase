package java1;

import java.util.Scanner;
//cambio menor
public class HolaMundo {
	
	public static void ejercicio1() {
		int n1=5, n2=2;
		System.out.println(36+27); 
		System.out.println("La suma da: " + (n1+n2));
		double n3 = Double.valueOf(n1) / Double.valueOf(n2);
		System.out.println(n3);
	}
	

	public static void ejercicio2() {
		int n1 = 15, n2 = 4;
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
	}
	
	public static void ejercicio3() {
		int num1 = 0, num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		num2 = sc.nextInt();
		System.out.println(num1+num2); 
		sc.close();
	}
	
	
	public static void banco (){
		Scanner sc=new Scanner(System.in);
		
		float saldo=1000.0f;
		float dinero=0.0f;
		int opcion=0;
		
		while(opcion!=4){
			System.out.println("");//solo para añadir linea en blanco.
			System.out.println("BANCO DE CONFIANZA");
			System.out.println("1.Ingresar");
			System.out.println("2.Retirar");
			System.out.println("3.Consultar");
			System.out.println("4.Terminar");
			System.out.println("");
		
			System.out.print("Introduce una opción: ");
			opcion=sc.nextInt();
		

			switch(opcion){
			
				case 1:
					System.out.println("INGRESAR DINERO");
					System.out.println("Introduce la cantidad");
					dinero=sc.nextFloat();
					saldo=saldo+dinero;
					System.out.println("Tu saldo ahora es de "+saldo+" euros.");;
					break;
				
				case 2:
					System.out.println("RETIRAR DINERO");
					System.out.println("Introduce la cantidad");
					dinero=sc.nextFloat();
					saldo=saldo-dinero;
					System.out.println("Tu saldo ahora es de "+saldo+" euros.");
					break;
				
				case 3:
					System.out.println("CONSULTAR SALDO");
					System.out.println("Tu saldo ahora es de "+saldo+" euros.");
					break;
				
				case 4:
					System.out.println("Adiós, gracias por usar nuestros sevicios.");
					break;
			}
		}
		sc.close();
	}
	
	public static void ejercicio4() {
		double a=1.1, b=2.2, c=3.3, d=4.4;
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
		System.out.println("\n"+ (((a+b)*c)/d));
		
	}

	
	public static void ejercicio6() {
		int A = 1, B = 2, C = 3, D = 4, X = 0;
		
		System.out.println("A inicialmente es: " + A);
		System.out.println("B inicialmente es: " + B);
		System.out.println("C inicialmente es: " + C);
		System.out.println("D inicialmente es: " + D);
		
		X = B;
		B = C;
		C = A;
		A = D;
		D = X;
		
		System.out.println("A ahora es: " + A);
		System.out.println("B ahora es: " + B);
		System.out.println("C ahora es: " + C);
		System.out.println("D ahora es: " + D);
		
	}
	
	private static void ejemplosComparaciones() {
		int a = 1;
		int b = 2;
		String cad1 = "hola";
		String cad2 = "adiós";
		String cad3 = "Hola";
		System.out.println(a==b);
		System.out.println(cad1.equals(cad2));//comparación exacta de cadenas
		System.out.println(cad1.equalsIgnoreCase(cad3));//comparación ignorando case sensitive
		

	}
	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio6();
		ejemplosComparaciones();
		//banco();
		
	}

}