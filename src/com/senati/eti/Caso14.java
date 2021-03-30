package com.senati.eti;

import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Alumno: ");
		String alum = sc.nextLine();
		
		System.out.println("\n--------------------------");
		System.out.println(">> Seleccione su Carrera: ");
		System.out.println("[DS] Desarrollo de Software");
		System.out.println("[RC] Redes y Conectividad");
		System.out.println("[DG] Diseño Gráfico");
		System.out.println("----------------------------");
		System.out.print(">> [DS/RC/DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("\n>> Turno [M/T/N]: ");
		String turno = sc.nextLine();
		
		float desc = 0;
		float tp = 0;
		float eqv = 0;
		float mon = 0;
		float dol = (float) 3.33;
		
		if (carrera == "DS" && turno == "M") {
			mon = 1500;
			desc = (mon * 10) / 100;
			tp = mon - desc;
			eqv =  tp / dol;
		}
		
		if (carrera == "DS" && turno == "T") {
			mon = 1500;
			desc = (mon * 20) / 100;
			tp = mon - desc;
			eqv =  tp / dol;
		}
 		
		if (carrera == "DS" && turno == "N") {
			mon = 1500;
			desc = (mon * 15) / 100;
			tp = mon - desc;
			eqv =  tp / dol;
		}
		
		if (carrera != "DS" && turno != "M"){
			mon = 1500;
			desc = (mon * 10) / 100;
			tp = mon - desc;
			eqv =  tp / dol;
		}

	}

}
