package javabeans;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductoTest {

  @Test
  public void testMultiplicarDosNumerosReales() {
    Producto producto = new Producto();
    assertEquals(6.0, producto.multiplicar(2.0, 3.0));
    assertEquals(-6.0, producto.multiplicar(-2.0, 3.0));
    assertEquals(0.0, producto.multiplicar(0.0, 3.0));
  }

  @Test
  public void testMultiplicarDosNumerosEnteros() {
    Producto producto = new Producto();
    assertEquals(6, producto.multiplicar(2, 3));
    assertEquals(-6, producto.multiplicar(-2, 3));
    assertEquals(0, producto.multiplicar(0, 3));
  }

  @Test
  public void testMultiplicarTresNumerosReales() {
    Producto producto = new Producto();
    assertEquals(24.0, producto.multiplicar(2.0, 3.0, 4.0));
    assertEquals(-24.0, producto.multiplicar(-2.0, 3.0, 4.0));
    assertEquals(0.0, producto.multiplicar(0.0, 3.0, 4.0));
  }

  @Test
  public void testObtenerPotencia() {
    Producto producto = new Producto();
    assertEquals(8.0, producto.obtenerPotencia(2.0, 3.0));
    assertEquals(1.0, producto.obtenerPotencia(2.0, 0.0));
    assertEquals(0.25, producto.obtenerPotencia(2.0, -2.0));
  }
}