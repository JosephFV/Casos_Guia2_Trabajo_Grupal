package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Ingreso de datos
		System.out.print(">> Ingrese  nombre: ");
		String nombre = sc.nextLine();
		System.out.print(">> Ingrese horas trabajadas: ");
		float ht = sc.nextFloat();
		System.out.print(">> Ingrese tarifa por hora: ");
		float t = sc.nextFloat();
		System.out.print(">> Ingrese los minutos de tardanza: ");
		int m = sc.nextInt();
		
		// Variables
		float importe = 0;
		float bono = 0;
		float desc = 0;
		float meta = 0;
		
		// Resultados
		importe = ht * t;
		
		if (ht > 60) {
			bono = (importe * 13) / 100;
		}
		
		else {
			bono = (importe * 4) / 100;
		}
		
		if (m > 15) {
			desc = (importe * 3) / 100;
		}
		
		else {
			desc = 0;
		}
		
		if (ht >= 0 && ht <= 70) {
			meta = (ht * 100) / 70; 
		}
		
		System.out.println("\n--------------------");
		System.out.println(">>>> RESULTADOS <<<<");
		System.out.println("--------------------");
		System.out.println(">> Trabajador: " + nombre);
		System.out.println(">> Horas Trabajadas: " + ht);
		System.out.println(">> Tarifa por horas: " + t);
		System.out.println(">> Importe: " + importe);
		System.out.println(">> Bono: " + bono);
		System.out.println(">> Descuento: " + desc);
		System.out.println(">> Meta Alcanzada: " + meta + "%");

	}

}
