package com.practica.clases;

public class Televisor extends Electrodomestico {
	
	private int resolucion;
	private boolean sincronizadorTDT;
	
	
	public Televisor(String color, char consumoEnergetico, double precioBase, double peso, int resolucion,
			boolean sincronizadorTDT) {
		super(color, consumoEnergetico, precioBase, peso);
		this.resolucion = resolucion;
		this.sincronizadorTDT = sincronizadorTDT;
	}
	
	@Override
	public double obtenerPrecioFinal() {
		
		double plus = super.obtenerPrecioFinal(); //De esta forma obtenemos el precio final, función heredada de la clase padre
		
		if(resolucion > 40) {
			plus += precioBase * 0.3;
		}
		if(this.sincronizadorTDT) {
			plus += 50;
		}
		return plus;
	}

	
}
