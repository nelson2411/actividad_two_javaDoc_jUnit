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
	
	/*
	 * Al ejecutar en la consola visualizaremos un menú con las opciones de los métodos que se pueden ejecutar.
	 * Se ejecutará un prompt para que el usuario ingrese la opción deseada.
	 * 
	 */
	
	public static void main(String[] args) {
		Producto producto = new Producto();
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("1. Multiplicar dos números reales");
			System.out.println("2. Multiplicar dos números enteros");
			System.out.println("3. Multiplicar tres números reales");
			System.out.println("4. Obtener potencia");
			System.out.println("5. Salir");
			System.out.print("Ingrese la opción deseada: ");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Ingrese el primer número real: ");
				double a = scanner.nextDouble();
				System.out.print("Ingrese el segundo número real: ");
				double b = scanner.nextDouble();
				System.out.println("El producto de los números reales es: " + producto.multiplicar(a, b));
				break;
			case 2:
				System.out.print("Ingrese el primer número entero: ");
				int c = scanner.nextInt();
				System.out.print("Ingrese el segundo número entero: ");
				int d = scanner.nextInt();
				System.out.println("El producto de los números enteros es: " + producto.multiplicar(c, d));
				break;
			case 3:
				System.out.print("Ingrese el primer número real: ");
				double e = scanner.nextDouble();
				System.out.print("Ingrese el segundo número real: ");
				double f = scanner.nextDouble();
				System.out.print("Ingrese el tercer número real: ");
				double g = scanner.nextDouble();
				System.out.println("El producto de los números reales es: " + producto.multiplicar(e, f, g));
				break;
			case 4:
				System.out.print("Ingrese la base: ");
				double h = scanner.nextDouble();
				System.out.print("Ingrese el exponente: ");
				double i = scanner.nextDouble();
				System.out.println("La potencia es: " + producto.obtenerPotencia(h, i));
				break;
			case 5:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opcion != 5);
		scanner.close();
	}
	
	
	
	
}
