package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer n�mero: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingrese el segundo n�mero: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Ingrese el tercer n�mero: ");
		float n3 = sc.nextFloat();
		
		System.out.print("Ingrese el cuarto n�mero: ");
		float n4 = sc.nextFloat();
		
		String res = "";
		
		if (n1 > n2 && n1 > n3 && n1 > n4)
			 res = "El primer n�mero es el mayor";
		
		if (n2 > n1 && n2 > n3 && n2 > n4)
			res = "El segundo n�mero es el mayor";
		
		if (n3 > n1 && n3 > n2 && n3 > n4)
			res = "El tercer numero es el mayor";
		
		if (n4 > n1 && n4 > n2 && n4 > n3)
			res = "El cuarto n�mero es el mayor";
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Numero 1: " + n1);
		System.out.println("Numero 2: " + n2);
		System.out.println("Numero 3: " + n3);
		System.out.println("Numero 4: " + n4);
		System.out.println("--------------------");
		System.out.println("Respuesta: " + res);
	}

}
