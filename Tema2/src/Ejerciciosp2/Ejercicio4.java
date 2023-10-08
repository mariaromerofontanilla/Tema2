package Ejerciciosp2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//variable
		String dado1, dado2;
		int num1;
		int num2;
		int calculo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que numero has sacado en la primera tirada: ");
		dado1 = sc.next();
		
		System.out.println("Que numero has sacado en la segunda tirada: ");
		dado2 = sc.next();
		
		num1 = switch (dado1) {
		case "UNO","uno" :
			yield 1;
		case "DOS","dos" :
			yield 2;
		case "TRES","tres" :
			yield 3;
		case "CUATRO","cuatro" :
			yield 4;
		case "CINCO","cinco" :
			yield 5;
		case "SEIS","seis" :
			yield 6;
		default:
			yield -1;
		};
		num2 = switch (dado2) {
		case "UNO","uno" :
			yield 1;
		case "DOS","dos" :
			yield 2;
		case "TRES","tres" :
			yield 3;
		case "CUATRO","cuatro" :
			yield 4;
		case "CINCO","cinco" :
			yield 5;
		case "SEIS","seis" :
			yield 6;
		default:
			yield -1;
		};
		
		calculo = (num1+num2);
		
		System.out.println("La suma de la tira 1 es: " + dado1 + " y la tirada 2 es: " + dado2 + " es de:  " + calculo);
		
		sc.close();

	}

}
