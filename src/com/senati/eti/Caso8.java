package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Ingrese nota: ");
		float nota = sc.nextFloat();
		
		String estado = "";
		
		if (nota >= 0 && nota <= 7) {
			estado = "Sin Palabras";			
		}
		
		if (nota >= 8 && nota <= 10){
			estado = "Malo";
		}
		
		if (nota >= 11 && nota <= 14){
			estado = "Regular";
		}
		
		if (nota >= 15 && nota <= 17){
			estado = "Notable";
		}
		
		if (nota >= 18 && nota <= 20){
			estado = "Excelente";
		}
		
		System.out.println(">> Estado Obtenido: " + estado);

	}

}
