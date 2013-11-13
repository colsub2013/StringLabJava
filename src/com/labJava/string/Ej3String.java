package com.labJava.string;

import java.util.Date;

import com.labJava.constantes.Constantes;

/*
 	
 	Ejercicio 3:
 	
 	Implementar el código del método 'private static void procesarStringBuilder(int cantidadDeElementos) {' 
 	tal que, en forma similar a los otros 2 métodos implementados, utilice el método 'obtenerTiempoEnMiliSegundos'
 	para calcular la velocidad de procesamiento de un array de StringBuilders que contiene 1.000.000 de elementos
 	donde c/u contiene un StringBuilder con el abecedario.
 	
 	Una vez implementado el método, ejecutar cada uno de estos métodos por separado (procesarStringBuilder, 
 	procesarStringStringBuffer y procesarString) tal de medir la velocidad de procesamiento.  
 	
 	Incrementar la cantidad de elementos del array para ver que método soporta más el procesamiento hasta agotar 
 	la memoria del heap.
 
 */

public class Ej3String implements Constantes {

	
	public static void main(String[] args) {

		int cantidad = 1000000;

		if(args[0].equals(Tipos.STRING.getTipo())) {
			procesarString(cantidad);
		} else if(args[0].equals(Tipos.STRINGBUFFER.getTipo())) {
			procesarStringStringBuffer(cantidad);			
		} else {
			System.out.println("La opción seleccionada no está disponible");
		}

	}
	
	
	private static void procesarString(int cantidadDeElementos) {

		long inicioST = obtenerTiempoEnMiliSegundos("inicioST");
		String[] strArr = new String[cantidadDeElementos];
	    for(int i=0; i<strArr.length; i++) {
	    	strArr[i]=new String("abcdefghijklmnopqrstuvwxyz");
	    }
		
		long finST = obtenerTiempoEnMiliSegundos("finST");
		
	    System.out.println("TIEMPO DE PROCESAMIENTO CON STRING: " + (finST - inicioST) + " ms ");
	    
	}
	

	private static void procesarStringStringBuffer(int cantidadDeElementos) {
		
		long inicioSBF = obtenerTiempoEnMiliSegundos("inicioSB");
	    StringBuffer[] sbfArr = new StringBuffer[1000000];
	    for(int i=0; i<sbfArr.length; i++) {
	    	sbfArr[i]=new StringBuffer("abcdefghijklmnopqrstuvwxyz");
	    }
	    
		long finSBF = obtenerTiempoEnMiliSegundos("finSB");
	    	    	    
	    System.out.println("TIEMPO DE PROCESAMIENTO CON STRINGBUFFFER: " + (finSBF - inicioSBF)  + " ms ");
		
	}
	

	private static void procesarStringBuilder(int cantidadDeElementos) {
		
		
		// Agregar código
		
	}

	
	
	private static long obtenerTiempoEnMiliSegundos(String ptoDeMedicion) {

		long tiempo = new Date().getTime();
	    System.out.println("Date() - Tiempo en milisegundos de " + ptoDeMedicion +  " : " + tiempo + " ms ");		
		return tiempo;

	}

}
