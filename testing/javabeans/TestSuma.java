package javabeans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuma {

	@Test
	void testSumaReales() {
		Suma suma = new Suma();

		assertEquals(8.2, suma.sumaReales(2.5, 5.7));

	}

	@Test
	void testSumaRealesUsarNegativo() {
		Suma suma = new Suma();

		assertEquals(5.0, suma.sumaReales(10.5, -5.5));

	}

	@Test
	void testSumaRealesNoIgual() {
		Suma suma = new Suma();

		assertNotEquals(10.0, suma.sumaReales(4.5, 4.5));

	}

	@Test
	void testSumaInts() {
		Suma suma = new Suma();

		assertEquals(8, suma.sumaReales(4, 4));

	}

	@Test
	void testSumaIntsUsarNegativos() {
		Suma suma = new Suma();

		assertEquals(10, suma.sumaReales(20, -10));

	}

	@Test
	void testSumaIntsNoIgual() {
		Suma suma = new Suma();

		assertNotEquals(11, suma.sumaReales(5, 5));

	}

	@Test
	void testSumaTresReales() {
		Suma suma = new Suma();

		assertEquals(18.5, suma.sumaTresReales(5.1, 6.2, 7.2));
	}

	@Test
	void testSumaTresRealesUsarNegativos() {
		Suma suma = new Suma();

		assertEquals(18.5, suma.sumaTresReales(15.7, 6.2, -3.4));
	}

	@Test
	void testSumaTresRealesNoIgual() {
		Suma suma = new Suma();

		assertNotEquals(10.5, suma.sumaTresReales(5.1, 6.2, 7.2));
	}
	
}
