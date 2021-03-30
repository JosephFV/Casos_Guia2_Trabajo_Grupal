package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println(">>>> CALCULO DE IMPUESTO <<<<");
		System.out.println("-----------------------------");
		System.out.print(">> Ingrese su sueldo: ");
		float sueldo = sc.nextFloat();
		float impuesto = 0;
		
		if (sueldo > 2800) {
			impuesto = (sueldo * 5) / 100;
		}
		else {
			impuesto = (sueldo * 2) / 100;			
		}
		
		System.out.println(">> Impuesto Calculado: " + impuesto);

	}

}
