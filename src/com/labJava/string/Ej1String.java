package com.labJava.string;

import com.labJava.constantes.Constantes;

public class Ej1String implements Constantes {

	
	/*

	Ejercicio 1: Se tiene el m�todo 'private static void devolverMesesEnTexto(String texto) {' el cual imprime por pantalla los meses que son nombrados 
	en un texto el cual es pasado en el argumento del m�todo. Este tiene problemas de funcionalidad como de performance, �Pueden identificarlos? 
	�C�mo se solucionar�an?   

	*/
	
	
	public static void main(String[] args) {

		
		String prueba = "  Enero treinta d�as trae   Noviembre    como abril   junio    y   Septiembre  de veintiocho no hay m�s que uno los dem�s de treinta y uno";

		devolverMesesEnTexto(prueba); 

		
	}
	
	private static void devolverMesesEnTexto(String texto) {
		
		String[] pruebaArr = texto.split(" ");
		String[] resultado = new String[pruebaArr.length];
		
		
		for(int j=0; j<pruebaArr.length; j++) {
			
			if(pruebaArr[j].equals(enero)) {
				resultado[j] = enero;
			} else if(pruebaArr[j].equals(febrero)) {
				resultado[j] = febrero;				
			} else if(pruebaArr[j].equals(marzo)) {
				resultado[j] = marzo;				
			} else if(pruebaArr[j].equals(abril)) {
				resultado[j] = abril;				
			} else if(pruebaArr[j].equals(mayo)) {
				resultado[j] = mayo;				
			} else if(pruebaArr[j].equals(junio)) {
				resultado[j] = junio;				
			} else if(pruebaArr[j].equals(julio)) {
				resultado[j] = julio;				
			} else if(pruebaArr[j].equals(agosto)) {
				resultado[j] = agosto;				
			} else if(pruebaArr[j].equals(setiembre)) {
				resultado[j] = setiembre;				
			} else if(pruebaArr[j].equals(octubre)) {
				resultado[j] = octubre;				
			} else if(pruebaArr[j].equals(noviembre)) {
				resultado[j] = noviembre;				
			} else if(pruebaArr[j].equals(diciembre)) {
				resultado[j] = diciembre;				
			}
			
		}
		
		for(String x : resultado) {
			System.out.println(x);			
		}

		
		
	}

}
