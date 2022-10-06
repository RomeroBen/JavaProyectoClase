package colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EjemplosArrays {

	
	public static void foreach1() {
	String mesBuscado = "Enero";	
	String [] meses = new String[12];
	meses[0]="Enero";
	meses[1]="Febrero";
	meses[2]="Marzo";
	meses[3]="Abril";
	meses[4]="Mayo";
	meses[5]="Junio";
	meses[6]="Julio";
	meses[7]="Agosto";
	meses[8]="Septiembre";
	meses[9]="Octubre";
	meses[10]="Noviembre";
	meses[11]="Diciembre";
//		for(String mes: meses) {
//			System.out.println("El mes " + mes);
//		}
	
	//Búsqueda moderna con lambda
	if (Arrays.stream(meses).anyMatch(n -> n.equals(mesBuscado))) {
		System.out.println("El nombre " + mesBuscado + " está en el array");
	}else {
		System.out.println(mesBuscado + " no encontrado...");
	}
	
	}
	
	
	public static void burbuja() {
		int[] nums = {15, 6, 9, 12, 20};
		Arrays.sort(nums); //ordena el array
		System.out.println(Arrays.toString(nums));
	}
	
	public static void ordenaCadena() {
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", 
				"Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
		Arrays.sort(meses);
		System.out.println(Arrays.toString(meses));
		//ordena case insensitive
		Arrays.sort(meses,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(meses));
		//Orden inverso case sensitive
		Arrays.sort(meses, Collections.reverseOrder());
		System.out.println(Arrays.toString(meses));
		//orden inverso case insensitive
		Arrays.sort(meses, String.CASE_INSENSITIVE_ORDER.reversed());
		System.out.println(Arrays.toString(meses));
		//orden por longitud de palabras
		Arrays.sort(meses, Comparator.comparingInt(String::length));
		System.out.println(Arrays.toString(meses));
	}
	
	public static void recorreArray() {
		int numAlumno = 1;
		double notaMediaGlobal=0;
		int[][] notas = { { 5, 4, 9 }, { 8, 5, 8}, { 0, 10, 5 }, { 9, 0, 8 } };
		for (int[] alumno:notas) {
			double sumaNotas = 0;
			for(int nota:alumno) {
				sumaNotas += nota;
				notaMediaGlobal += nota;
			}
			System.out.printf("Media del alumno: %d: %.2f\n",numAlumno,(sumaNotas/alumno.length));
			numAlumno++;
		}
		
		System.out.printf("Media de todos los alumnos: %.2f\n",(notaMediaGlobal/(notas.length * notas[0].length)));
		
	}
	
	public static void main(String[] args) {
		//foreach1();
		//burbuja();
		//ordenaCadena();
		recorreArray();
	}	

}
