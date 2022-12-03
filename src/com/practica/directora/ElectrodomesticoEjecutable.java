package com.practica.directora;

import com.practica.clases.Electrodomestico;
import com.practica.clases.Lavadora;
import com.practica.clases.Televisor;



public class ElectrodomesticoEjecutable {

	public static void main(String[] args) {
		
		
		Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];
		
		listaElectrodomesticos[0] = new Electrodomestico("verde", 'E', 250.99, 150); //String color, char consumoEnergetico, double precioBase, double peso
		listaElectrodomesticos[1] = new Lavadora("azul", 'E', 270.99, 170, 35); //String color, char consumoEnergetico, double precioBase, double peso, int carga
		listaElectrodomesticos[2] = new Lavadora("rojo", 'F', 275.99, 175, 20);
		listaElectrodomesticos[3] = new Televisor("gris", 'A', 400.00, 90, 50, true); //String color, char consumoEnergetico, double precioBase, double peso, int resolucion, boolean sincronizadorTDT
		listaElectrodomesticos[4] = new Televisor("negro", 'C', 300.00, 100, 30, false);
		listaElectrodomesticos[5] = new Televisor("blanco", 'C', 200.00, 30, 45, true);
		listaElectrodomesticos[6] = new Lavadora("azul", 'F', 275.99, 185, 20);
		listaElectrodomesticos[7] = new Lavadora("rojo", 'A', 199.99, 275, 40);
		listaElectrodomesticos[8] = new Electrodomestico("azul", 'C', 260.99, 250);
		listaElectrodomesticos[9] = new Electrodomestico("verde", 'A', 350.99, 90);
		
		
		//Recorrer array y ejecutar método ObtenerPrecioFinal()
			
			double sumaElectrodomesticos = 0;
			double sumaTelevisores = 0;
			double sumaLavadoras = 0;
			
			for(int i = 0; i < listaElectrodomesticos.length; i++) {
				
				if(listaElectrodomesticos[i] instanceof Electrodomestico ) {
					sumaElectrodomesticos += listaElectrodomesticos[i].obtenerPrecioFinal();
				}
				
				if(listaElectrodomesticos[i] instanceof Lavadora) {
					sumaLavadoras += listaElectrodomesticos[i].obtenerPrecioFinal();

				}
				if(listaElectrodomesticos[i] instanceof Televisor) {
					sumaTelevisores += listaElectrodomesticos[i].obtenerPrecioFinal();
				}
			}
			
			System.out.println("--------------ELECTRODOMESTICOS----------------");
			System.out.println("Estos son los precios totales de los electrodomésticos: " + sumaElectrodomesticos);
			
			System.out.println("--------------LAVADORAS----------------");
			System.out.println("Estos son los precios totales de las lavadoras: " + sumaLavadoras);
			
			System.out.println("--------------TELEVISOR----------------");
			System.out.println("Estos son los precios totales de los televisores: " + sumaTelevisores);
		
	
	}
	}

