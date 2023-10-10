package Ejerciciosp2;

//importacion del Scanner 
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//variable
		//variable cadena
		String categoria;
		//Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas la categoria de tu carnet
		System.out.println("Introduce la categoria de tu carnet de conducir: ");
		//Scanner de la variable
		categoria = sc.next();
		
		//Creacion del switch
		switch (categoria) {
		case "E":
			System.out.println("E. remolques");
		break;	
		case "D":
			System.out.println("D. autobuses");
		break;
		case "C1","C2","C3","C4","C5":
			System.out.println("C1-C5. camiones");
		break;
		case "A":
			System.out.println("A. motocicletas");
		break;
		case "B1","B2":
			System.out.println("B1-B2. automóviles");
		break;
		default:
			System.out.println("Categoría no contemplada");
		break;	
		}
		//cierre del Scanner
		sc.close();
	}

}
