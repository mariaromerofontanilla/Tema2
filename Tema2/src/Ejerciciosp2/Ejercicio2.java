package Ejerciciosp2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//variables
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero de la semana del 1 al 7");
		numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Lunes");
		break;
		case 2:
			System.out.println("Martes");
		break;	
		case 3:
			System.out.println("Miercoles");
		break;	
		case 4:	
			System.out.println("Jueves");
		break;	
		case 5:
			System.out.println("Viernes");
		break;
		case 6:
			System.out.println("Sabado");
		break;
		case 7:
			System.out.println("Domingo");
		break;	
		default:
			System.out.println("No has introducido el numero que debes de introducir; ERROR");
		}
		sc.close();
	}

}
