package com.senati.eti;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Ingrese Cliente: ");
		String cliente = sc.nextLine();
		System.out.println("\n-------------------");
		System.out.println(">>>> PRODUCTOS <<<<");
		System.out.println("-------------------");
		System.out.println(">> [TB] Tablet");
		System.out.println(">> [LT] Laptop");
		System.out.println(">> [MN] Monitor");
		System.out.println(">> [IM] Impresora");
		System.out.println("--------------------");
		System.out.print(">> Ingrese Producto [TB/LT/MN/IM]: ");
		String producto = sc.nextLine();
		System.out.print(">> Ingrese Cantidad: ");
		int cantidad = sc.nextInt();
		
		Scanner bc = new Scanner(System.in);
		System.out.println("\n------------------------");
		System.out.println(">>>> FORMAS DE PAGO <<<<");
		System.out.println("------------------------");
		System.out.println(">> [C1] Al Contado");
		System.out.println(">> [C2] Crédito");
		System.out.println("------------------------");
		System.out.print(">> Ingrese forma de pago [C1/C2]: ");
		String pago = bc.nextLine();
		
		String fp = "";
		String p = "";
		float importe = 0;
		float precio = 0;
		float desc = 0;
		float tp = 0;
		float aumento = 0;
		
		if (producto == "TB") {
			p = "Tablet";
			precio = 350;
		}
		
		if (producto == "LT") {
			p = "Laptop";
			precio = 2300;
		}
		
		if (producto == "MN") {
			p = "Monitor";
			precio = 850;
		}
		
		if (producto == "IM") {
			p = "Impresora";
			precio = 680;
		}
		
		if (pago == "C1") {
			importe = precio * cantidad;
			desc = (importe * 5) / 100;
			tp = importe - desc;
			fp = "Al contado";
		}
		
		if (pago == "C2") {
			importe = precio * cantidad;
			aumento = (importe * 12) / 100;
			tp = importe + aumento;
			fp = "Crédito";
		}
		
		
		System.out.println("\nCliente: " + cliente);
		System.out.println("Producto: " + p);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Importe: " + importe);
		System.out.println("Forma de pago: " + fp);
		System.out.println("Descuento: " + desc);
		System.out.println("Total a pagar: " + tp);

	}

}
