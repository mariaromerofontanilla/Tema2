package Ejerciciosp2;

//importación del Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {	
		//variariable
		//variable entera nota
		int nota;
		//Crear un Scanner
		Scanner sc = new Scanner(System.in);
		
		//Se lee por pantalla un mensaje que dice introduzca tu nota
		System.out.println("Introduce tu nota: ");
		//Scannear la variable nota
		nota = sc.nextInt();
			
			//Creamor el switch
			switch (nota) {
			case 0,1,2,3,4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;	
			case 6:
				System.out.println("Bien");
				break;
			case 7,8:
				System.out.println("Notable");
				break;
			case 9,10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("La noata introducida es incorrecta, no esta en el sistema");
				break;
		}
			//cierre del Scanner
			sc.close();
	}
	
}
