package com.practica.clases;

public class Electrodomestico {

	//VALORES POR DEFECTO
	protected final static String COLOR_DEFECTO = "blanco"; //Protected indica que la variable puede heredarse por las sublcases 
	// dentro del mismo paquete, final es la palabra clave reservada para las constantes, y static se coloca a elementos que no van a instanciarse, 
	// como en este caso las constantes por defecto.
	protected final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
	protected final static double PRECIO_BASE_DEFECTO = 100;
	protected final static double PESO_DEFECTO = 5;
	
	//ATRIBUTOS O PROPIEDADES
	protected String color;
	protected char consumoEnergetico;
	protected double precioBase;
	protected double peso;
	
	
	//CONSTRUCTOR
	public Electrodomestico(String color, char consumoEnergetico, double precioBase, double peso) {
		super();
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	
	//GETTERS
	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}
	
	
	//MÉTODOS

	//Método comprobar color
	private void comprobarColor(String color) {
		
		String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
		boolean encontrado = false; // Esta variable se inicializa como false, con ella comprobamos si existen los colores, y si existen será true
		
			for(int i = 0; i < colores.length && !encontrado; i++) { //!encontrado sería false, porque aunque la hayamos inicializado como false por defecto es true
				if(colores[i].equals(color)) {
					encontrado = true;
				}
			}
			if(encontrado) {
				this.color = color;
			} else {
				this.color = COLOR_DEFECTO;
			}
		}
	
	//Método comprobar consumo energético
	public final void comprobarConsumoEnergetico(char consumoEnergetico) { //Final por que no se va a poder heredar, se podría no poner, pero es buna práctica
	
		if(consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}
	}
	
	public double obtenerPrecioFinal() {
		double plus = 0;
		switch(consumoEnergetico) {
			case 'A':
				plus += 100; 
				break;
			case 'B':
				plus += 80;
				break;
			case 'C':
				plus += 60;
				break;
			case 'D':
				plus += 50;
				break;
			case 'E':
				plus += 30;
				break;
			case 'F':
				plus += 10;
				break;
		}
		
		if(peso >= 0 && peso <= 19) {
			plus += 10;
		} else if (peso >= 20 && peso <= 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}
		
		return precioBase + plus;
	}
	
	}
