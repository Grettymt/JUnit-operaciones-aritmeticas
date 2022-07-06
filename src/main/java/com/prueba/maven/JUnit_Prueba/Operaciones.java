package com.prueba.maven.JUnit_Prueba;

/**
 * Esta clase contiene los métodos de operaciones aritméticas
 * (Suma, resta, multiplicación y división). 
 *
 * @version 1 2022-07-06
 *
 * @author Gretty Mosquera-gretymosquera@gmail.com
 *
 */
public class Operaciones {

	//Método sumar
	public int suma (int numero1, int numero2){
		int resultado = numero1 + numero2; 
		return resultado;
	}
	
	//Método restar
	public int resta (int numero1, int numero2){
		int resultado = numero1 - numero2; 
		return resultado;
	}
	
	//Método multiplicar
	public int multiplicacion (int numero1, int numero2){
		int resultado = numero1 * numero2; 
		return resultado;
	}
	
	//Método dividir
	public int division (int numero1, int numero2){
		int resultado = numero1 / numero2; 
		return resultado;
	}
}
