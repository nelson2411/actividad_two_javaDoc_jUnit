package javabeans;


/*
 * 
 * En esta clase necesitamos los siguientes metodos:
 * Un metodo que multiplique dos numeros reales y devuelva el resultado.
 * Un metodo que que brinde el producto de dos numeros enteros. Tomando dos parametros y retornando el resultado.
 * Un metodo que brinde el producto de tres numeros reales. Tomando tres parametros y retornando el resultado.
 * Obtener potencia: Metodo que recibe dos parametros, la base y el exponente, y devuelve la potencia. 
 * 
 * 
 */

public class Producto {

	/**
	 * Retorna el producto de dos numeros reales
	 * @param a primer numero
	 * @param b segundo numero
	 * @return producto de a y b
     * @author Nelson Rosales
	 * 
	 */
	
	public double multiplicar(double a, double b) {
		return a * b;
    }
	
	/**
	 * 
	 * Metodo que brinde el producto de dos numeros enteros.
	 * @param a primer numero
	 * @param b segundo numero
	 * @return producto de a y b
	 * @author nelson rosales
	 * 
	 */
	
	public int multiplicar(int a, int b) {
		return a * b;
    }
	
	/**
	 * Metodo que brinde el producto de tres numeros reales.
	 * @param a primer numero
	 * @param b segundo numero
	 * @param c tercer numero	
	 * @return producto de a, b y c
	 * @author nelson rosales
	 */
	
	public double multiplicar(double a, double b, double c) {
		return a * b * c;
    }
	
	
	/**
	 * Metodo que recibe dos parametros, la base y el exponente, y devuelve la
	 * potencia.	 * 
	 * @param base      base de la potencia
	 * @param exponente exponente de la potencia
	 * @return potencia de base elevado a exponente
	 * @autor nelson rosales
	 *
	 */
	
	public double obtenerPotencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
	
	
}
