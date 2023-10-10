package Ejerciciosp2;

//importacion del Scanner
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//variable
		//variable cadena
		String dado1, dado2;
		//variable numero entero
		int num1;
		//variable numero entero
		int num2;
		//variable numero entero
		int calculo;
		//Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla de que numero has sacado en la primera tirada
		System.out.println("Que numero has sacado en la primera tirada: ");
		//scanner de la variable
		dado1 = sc.next();
		
		//Se lee por pàntalla de que numero has sacado en la segunda tirada
		System.out.println("Que numero has sacado en la segunda tirada: ");
		//Scanner de la variable
		dado2 = sc.next();
		
		//Crear switch
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
		//segundo switch creado
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
		
		//calculo de la variable num1 mas variable num2
		calculo = (num1+num2);
		
		//Se lee por pantalla el resultado
		System.out.println("La suma de la tira 1 es: " + dado1 + " y la tirada 2 es: " + dado2 + " es de:  " + calculo);
		
		//cierre del Scanner
		sc.close();

	}

}
