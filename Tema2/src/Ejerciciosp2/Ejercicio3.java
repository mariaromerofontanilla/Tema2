package Ejerciciosp2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//variable
		int num1, num2;
		String menu;
		//Crear Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce un numero: ");
		num2 = sc.nextInt();
		
		System.out.println("A. Sumar los numeros");
		System.out.println("B. Restar los numeros");
		System.out.println("C. Multiplicar los numeros");
		System.out.println("D. Dividir los numeros");
		menu = sc.next();
		
		switch (menu) {
		case "A","a":
			//calculo suma
			int suma = (num1 + num2);
			System.out.println(suma);
		break;	
		case "B","b":
			//calculo resta
			int resta = (num1 - num2);
			System.out.println(resta);
		break;	
		case "C","c":
			//calculo multiplicacion
			int multi = (num1 * num2);
			System.out.println(multi);
		break;	
		case "D","d":
			//calculo divicion
			int divi = (num1 / num2);
			System.out.println(divi);
		break;	
		default:
			System.out.println("Debes elegir entre las opciones de antes");
		break;		
		}
		
		sc.close();
	}

}
