package com.practica.clases;

public class Lavadora extends Electrodomestico {
	
	private int carga;
	

	public Lavadora(String color, char consumoEnergetico, double precioBase, double peso, int carga) {
		super(color, consumoEnergetico, precioBase, peso);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}


	@Override
	public double obtenerPrecioFinal() {
		
		double plus = super.obtenerPrecioFinal();
		
		if(carga > 30) {
			plus += 50;
		}
		return plus;
	}
	
	

}
