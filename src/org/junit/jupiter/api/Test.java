package org.junit.jupiter.api;

import javabeans.Producto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Producto utilizando JUnit 5.
 */
class ProductoTest {

    private final Producto producto = new Producto(); // Instancia de la clase a probar

    /**
     * Prueba el método multiplicar con dos números reales.
     */
    @Test
    void testMultiplicarReales() {
        assertEquals(6.0, producto.multiplicar(2.0, 3.0), 0.0001);
        assertEquals(-8.4, producto.multiplicar(-2.0, 4.2), 0.0001);
        assertEquals(0.0, producto.multiplicar(0.0, 5.5), 0.0001);
    }

    private void assertEquals(double d, double multiplicar, double e) {
		// TODO Auto-generated method stub
		
	}

	/**
     * Prueba el método multiplicar con dos números enteros.
     */
    @Test
    void testMultiplicarEnteros() {
        assertEquals(12, producto.multiplicar(3, 4));
        assertEquals(-10, producto.multiplicar(-2, 5));
        assertEquals(0, producto.multiplicar(0, 7));
    }

    private void assertEquals(int i, int multiplicar) {
		// TODO Auto-generated method stub
		
	}

	/**
     * Prueba el método multiplicar con tres números reales.
     */
    @Test
    void testMultiplicarTresReales() {
        assertEquals(24.0, producto.multiplicar(2.0, 3.0, 4.0), 0.0001);
        assertEquals(-6.0, producto.multiplicar(-1.0, 2.0, 3.0), 0.0001);
        assertEquals(0.0, producto.multiplicar(0.0, 2.0, 3.0), 0.0001);
    }

    /**
     * Prueba el método obtenerPotencia con valores válidos.
     */
    @Test
    void testObtenerPotencia() {
        assertEquals(8.0, producto.obtenerPotencia(2.0, 3.0), 0.0001);
        assertEquals(1.0, producto.obtenerPotencia(5.0, 0.0), 0.0001); // x^0 = 1
        assertEquals(0.25, producto.obtenerPotencia(2.0, -2.0), 0.0001); // Inverse power
        assertEquals(1.0, producto.obtenerPotencia(1.0, 100), 0.0001); // 1^n = 1
    }

}
