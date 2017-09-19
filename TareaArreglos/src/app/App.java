package app;

import java.util.Scanner;

import app.Matrix;

public class App {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int mayor1, mayor2, matrix, matrix1, suma1, suma2;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca el tamaño de la matriz");
			matrix = teclado.nextInt();
			matrix1 = teclado.nextInt();
			if (matrix1 == matrix) {
				mat.matri(matrix);
			}
		} while (matrix1 != matrix);
		do {
			suma1 = teclado.nextInt();
			suma2 = teclado.nextInt();
			System.out.println("Introduzca el tamaño de la matriz de Mayor y Menor AxA");
			mayor1 = teclado.nextInt();
			mayor2 = teclado.nextInt();
			if (mayor1 == mayor2) {
				mat.mayormenor(mayor2);
			}
		} while (suma1 != suma2);

		do {
			System.out.println("Introduzca el tamaño de la matriz de la suma AxA");
			suma1 = teclado.nextInt();
			suma2 = teclado.nextInt();
			if (suma1 == suma2) {
				mat.suma(suma1);
			}
		} while (suma1 != suma2);
	}
}
