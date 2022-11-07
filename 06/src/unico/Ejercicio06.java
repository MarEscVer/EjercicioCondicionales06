package unico;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Añada las tres notas de las cuales quiere conocer la media: ");
		System.out.print("Primera nota [1-3]: ");
		nota1 = Double.parseDouble(teclado.nextLine());
		System.out.print("Segunda nota [2-3]: ");
		nota2 = Double.parseDouble(teclado.nextLine());
		System.out.print("Segunda nota [3-3]: ");
		nota3 = Double.parseDouble(teclado.nextLine());
		
		media = (nota1 + nota2 + nota3) / 2;
		
		System.out.println("La media es: " + media);
		
	}
		
}