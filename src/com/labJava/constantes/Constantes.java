package com.labJava.constantes;

public interface Constantes {
	
	public enum Tipos {
		STRING("Str"),
		STRINGBUFFER("Strbf"),
		STRINGBUILDER("Strbl");
	
		private final String tipo;
		
		private Tipos(String t) { tipo = t;}
		
		public String getTipo() {
			return tipo;
		}
	
	};


	public enum MESES {enero, febrero, marzo, abril, mayo, junio, julio, agosto, setiembre, octubre};
	
	public static final String enero = "enero";
	public static final String febrero = "febrero";
	public static final String marzo = "marzo";
	public static final String abril = "abril";
	public static final String mayo = "mayo";
	public static final String junio = "junio";
	public static final String julio = "julio";
	public static final String agosto = "agosto";
	public static final String setiembre = "setiembre";
	public static final String octubre = "octubre";
	public static final String noviembre = "noviembre";
	public static final String diciembre = "diciembre";
	
}
