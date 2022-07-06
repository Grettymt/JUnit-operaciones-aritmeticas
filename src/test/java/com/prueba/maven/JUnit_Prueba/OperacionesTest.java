package com.prueba.maven.JUnit_Prueba;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class OperacionesTest {
	
	@Before
	public void cargaInicial() {
		//Antes de ejecutar nuestro test 
	}
	
	//El siguiente método se ejecutará como una prueba
	@Test
	public void test() {
		Operaciones opera = new Operaciones();
		
		//Validación resultado suma
		int resultadoSuma= opera.suma(10, 2);				
		/*
		 * Comparaciones por medio de aserciones.
		 * Aserción: Permite realizar validaciones de nuestros procesos.
		 */
		Assert.assertEquals(12, resultadoSuma);
		
		//Validación resultado resta
		int resultadoResta= opera.resta(15, 2);
		Assert.assertEquals(13, resultadoResta);
		
		//Validación resultado multiplicación 
		int resultadoMultiplicacion = opera.multiplicacion(20, 2);
		Assert.assertEquals(40, resultadoMultiplicacion);
		
		//Validación resultado división 
		int resultadoDivision = opera.division(40, 2);
		Assert.assertEquals(20, resultadoDivision);
	}
	
	@After
	public void terminarProceso() {
		//Terminar procesos o cierre de conexiones 
	}
}