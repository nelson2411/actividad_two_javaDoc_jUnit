package javabeans;



/*Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora.
*Esta clase tendrá los siguientes métodos:
*Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
*Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
*Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
* 
* 
*/






/**
 * Esta clase proporciona métodos para realizar operaciones de suma.
 * Tiene métodos para sumar dos números enteros, dos números reales,
 * y tres números reales.
 */
public class Suma {

    /**
     * Suma dos números reales.
     *
     * @param num1 El primer número real.
     * @param num2 El segundo número real.
     * @return La suma de los dos números reales.
     */
    public double sumaReales(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Suma dos números enteros.
     *
     * @param num1 El primer número entero.
     * @param num2 El segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumaEnteros(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Suma tres números reales.
     *
     * @param num1 El primer número real.
     * @param num2 El segundo número real.
     * @param num3 El tercer número real.
     * @return La suma de los tres números reales.
     */
    public double sumaTresReales(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    /**
     * Método principal para probar las operaciones de suma.
     *
     * @param args Argumentos de línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {
       Suma calculadora = new Suma();

        // Ejemplo de uso
        double resultadoReales = calculadora.sumaReales(3.5, 4.2);
        System.out.println("La suma de los dos números reales es: " + resultadoReales);

        int resultadoEnteros = calculadora.sumaEnteros(5, 7);
        System.out.println("La suma de los dos números enteros es: " + resultadoEnteros);

        double resultadoTresReales = calculadora.sumaTresReales(1.1, 2.2, 3.3);
        System.out.println("La suma de los tres números reales es: " + resultadoTresReales);
    }
}
