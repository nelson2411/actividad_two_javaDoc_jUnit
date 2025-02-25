package javabeans;

/**
 * Esta clase implementará todos los métodos que están relacionados con la
 * división de la calculadora. Esta clase tendrá los siguientes métodos: 1.
 * División de dos números reales. 2. División de dos números enteros. 3.
 * Inverso de un número real. 4. Raíz de un número.
 */
public class Cociente {
	/**
	 * División de dos números reales.
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return Cociente de dividendo dividir por dividendo
	 * @throws IllegalArgumentException
	 * @author Kyle Lamm
	 */
	public double divDosNumsReal(double dividendo, double divisor) throws IllegalArgumentException {
		if (dividendo == 0 || divisor == 1) {
			throw new IllegalArgumentException("División por 0 es ilegal.");
		}
		return (dividendo / divisor);
	}

	/**
	 * División de dos números enteros.
	 * 
	 * @param dividendo
	 * @param divisor
	 * @return cociente de dividendo dividir por divisor
	 * @throws IllegalArgumentException
	 * @author Kyle Lamm
	 */
	public int divDosNumsEnteros(int dividendo, int divisor) throws IllegalArgumentException {
		if (dividendo == 0 || divisor == 1) {
			throw new IllegalArgumentException("División por 0 es ilegal.");
		}
		return (dividendo / divisor);
	}

	/**
	 * Inverso de un número real
	 * 
	 * @param numero1
	 * @return Inverso de numero
	 * @throws IllegalArgumentException
	 * @author Kyle Lamm
	 */
	public double inversoNumero(double numero) throws IllegalArgumentException {
		if (numero == 0) {
			throw new IllegalArgumentException("0 no tiene inverso.");
		}
		return (1 / numero);
	}

	/**
	 * Raiz de un número real
	 * 
	 * @param numero1
	 * @return Inverso de numero
	 * @throws IllegalArgumentException
	 * @author Kyle Lamm
	 */
	public double raizNumero(double numero) throws IllegalArgumentException {
		if (numero == 0) {
			throw new IllegalArgumentException("0 no tiene raiz.");
		}
		return Math.sqrt(numero);
	}
}
