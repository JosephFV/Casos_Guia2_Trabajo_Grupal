package com.senati.eti;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Primer N�mero: ");
		float n1 = sc.nextFloat();
		System.out.print(">> Segundo N�mero: ");
		float n2 = sc.nextFloat();
		System.out.print("Operaci�n [1-6]: ");
		int op = sc.nextInt();
		
		float res = 0;
		String operacion = "";
		String res2 = "";
		
		if (op == 1) {
			res = n1 + n2; 
			operacion = "Suma";
		}
		
		if (op == 2) {
			res = n1 - n2; 
			operacion = "Resta";
		}
		
		if (op == 3) {
			res = n1 * n2; 
			operacion = "producto";
		}
		
		if (op == 4) {
			if (n2 == 0) {
				operacion = "No es posible dividir entre 0";
				res = 0;
			}
			
			else {
				res = n1 / n2; 
				operacion = "Divisi�n";				
			}
			
		}
		
		if (op == 5) {
			if (n2 == 0) {
				res = 0;
				operacion = "No es posible hallar el resto entero";
			}
			else {
				res = n1 % n2; 
				operacion = "Resto Entero";
			}
			
		}
		
		if (op == 6) {
			res = (n1 + n2) / 2; 
			operacion = "Promedio";
		}
		
		System.out.println("\n--------------------");
		System.out.println(">>>> RESULTADOS <<<<");
		System.out.println("--------------------");
		System.out.println(">> N�mero 1: " + n1);
		System.out.println(">> N�mero 2: " + n2);
		System.out.println(">> Operaci�n: " + operacion);
		System.out.println(">> Resultado: " + res);
	}

}

