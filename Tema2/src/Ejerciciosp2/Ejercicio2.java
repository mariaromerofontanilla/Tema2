package Ejerciciosp2;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//variables
		//variable de numero entero
		int numero;
		//Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que introduzcas un numero de la semana del 1 al 7
		System.out.println("Introduce un numero de la semana del 1 al 7");
		//Scanner de la varible
		numero = sc.nextInt();
		
		//Creacion del switch
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
		//cierre del Scanner
		sc.close();
	}

}
