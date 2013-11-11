package com.labJava.string;


/*
	Ejercicio 2: Dada la siguiente url: 
	
	http://www.labJava.com?param1=valor1&param2=valor2
	
	la cual contiene una serie de parámetros en forma de Query String, se quiere que dichos parámetros 
	sean impresos en pantalla en formato json implementando el método:
	
	private static void convertirURLQSaJSON(String qs) {...}
	
	Consideraciones:
	- La salida esperada con sintaxis json tiene la forma: {"param1":"valor1","param2":"valor2"}
	- La forma de escapar las comillas (en caso de usar el concatenador "+") es con una barra invertida (Ej.: "\"") 
	- Se recomienda usar los métodos siguientes: indexOf, substring, split y length() ...
	
*/


public class Ej2String {

	public static void main(String[] args) {
		
		String qs = "http://www.labJava.com?param1=valor1&param2=valor2";
		
		convertirURLQSaJSON(qs);
		
	}
	
	private static void convertirURLQSaJSON(String qs) {

		// Implementar código
		
	}
	

}
