package app;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {// matriz que genera unos y ceros
	public void matri(int limite) {
		int[] aux = new int[limite * limite];
		int diunos = limite + 1;
		int impresion = limite;
		int aux1 = -1;
		int variables = 0;
		aux[0] = 0;

		for (int i = 1; i < aux.length; i++) {

			if (i == diunos) {
				diunos = diunos + limite + 1;
				aux[i] = 0;

			} else {
				aux[i] = 1;
			}
			if (i == aux1 + limite) {
				aux1 = aux1 + limite;
			}

		}
		System.out.println("");
		System.out.println("Diagonal de 0 y 1 arriba");
		int[] aux2 = new int[impresion * impresion];
		aux2 = Arrays.copyOf(aux, aux.length);
		for (int i = 0; i < impresion; i++) {
			for (int j = 0; j < impresion; j++) {
				if (aux[variables] == 0) {
					// System.out.print(

					variables = variables + limite;
					limite = limite - 1;
					break;
				} else {
					aux[variables] = 0;
					variables++;

				}

			}
		}

		int vuelta = 0;
		int limite2 = impresion;
		for (int k : aux) {
			vuelta++;
			System.out.print(k);
			if (vuelta == impresion) {
				System.out.println("");
				impresion = impresion + limite2;
			}
		}

		System.out.println("Diagonal de 1 y 0 en toda la matriz ");
		for (int i = 0; i < aux2.length; i++) {
			if (aux2[i] == 1) {
				aux2[i] = 0;
			} else {
				aux2[i] = 1;
			}
		}
		System.out.println("");
		for (int i : aux2) {
			vuelta++;
			System.out.print(i);
			if (vuelta == impresion) {
				System.out.println("");
				impresion = impresion + limite2;
			}
		}
	}// aqui termina el codigo de las matriz ceros y unos

	public void suma(int size) {
		int C[] = new int[size * size];
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introdusca los valores de la matriz");
		for (int i = 0; i < C.length; i++) {
			C[i] = teclado.nextInt();
		}
		int x[] = new int[size];
		int acum = 0;
		int cont = 0;
		if (cont <= C.length) {
			for (int a = 0; a < size; a++) {
				for (int i = 0; i < size; i++) {
					if (C[cont] % 2 == 0) {
						acum = acum + C[cont];
						cont++;
					} else
						cont++;

				}
				x[a] = acum;
				acum = 0;
			}
		}
		int aslkfh = 0;
		System.out.println("Matriz Generada");
		for (int f : C) {
			System.out.print(f + " ");
			aslkfh++;
			if (aslkfh == size) {
				System.out.println(" ");
				aslkfh = 0;
			}
		}
		System.out.println("");
		System.out.println("La suma de los numeros paras de la matriz de cada linea es:");
		for (int i : x) {
			System.out.println(i);
		}
		System.out.println(" ");
	}// aqui termina el codigo de la suma de la raiz

	public void mayormenor(int size) {
		int corda = 0, corb = 0;
		int cont = 0;
		// Asigna Valores a la matris
		int[] a = new int[size * size];
		Scanner tecla = new Scanner(System.in);
		System.out.println("Introduzca los valores de la matriz");
		for (int i = 0; i < a.length; i++) {
			a[i] = tecla.nextInt();
		}

		int aux = a[0];
		if (cont <= a.length) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (a[cont] >= aux) {
						aux = a[cont];
						corda = i;
						corb = j;
					}
					cont++;
				}
			}
		}
		System.out.println("Valor mayor es:" + aux + " En la cordenada: " + corda + ":" + corb);

		int aux1 = a[0];
		corb = 0;
		corda = 0;
		cont = 0;
		if (cont <= a.length) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (a[cont] <= aux1) {
						aux1 = a[cont];
						corda = i;
						corb = j;
					}
					cont++;
				}
			}
		}
		System.out.println("Valor menor es:" + aux1 + " En la cordenada: " + corda + ":" + corb);

		System.out.println("Matriz Generada: ");
		int aslkfh = 0;
		for (int f : a) {
			System.out.print(f + " ");
			aslkfh++;
			if (aslkfh == size) {
				System.out.println("");
				aslkfh = 0;
			}
		}
		System.out.println("");

		System.out.println(" ");
	}
}
