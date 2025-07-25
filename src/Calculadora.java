/**
 * La clase Calculadora proporciona operaciones básicas de cálculo: suma, resta,
 * multiplicación y división entre dos números reales.
 *
 * @author Ivo Narváez
 * @version 1.0
 */
public class Calculadora {
    /**
     * Suma dos valores reales.
     *
     * @param valor1 El primer sumando.
     * @param valor2 El segundo sumando.
     * @return La suma de valor1 y valor2.
     * Precondición: True.
     * Postcondición: El resultado es igual a valor1 + valor2.
     */
    public double suma(double valor1,double valor2) {

        return (valor1 + valor2);
    }
    /**
     * Resta dos valores enteros.
     *
     * @param valor1 El minuendo.
     * @param valor2 El sustraendo.
     * @return La diferencia de valor1 y valor2.
     * Precondición: True.
     * Postcondición: El resultado es igual a valor1 - valor2.
     */
    public double resta(double valor1, double valor2){

        return (valor1 - valor2);
    }
    /**
     * Multiplica dos valores double.
     *
     * @param valor1 El primer factor.
     * @param valor2 El segundo factor.
     * @return El producto de valor1 y valor2.
     * Precondición: True.
     * Postcondición: El resultado es igual a valor1 * valor2.
     */
    public double multiplicacion(double valor1, double valor2){

        return (valor1 * valor2);
    }

    /**
     * Divide dos valores reales y devuelve un resultado decimal
     *
     * @param valor1 El dividendo.
     * @param valor2 El divisor. Debe ser distinto de cero.
     * @return El resultado de valor1 dividido por valor2 como número decimal.
     * Precondición: valor2 != 0.
     * Postcondición: El resultado es igual a (double) valor1 / valor2.
     *
     * @throws IllegalArgumentException si valor2 es igual a cero.
     */
    public double division(double valor1, double valor2){
        if(valor2 == 0) {
            throw new IllegalArgumentException("El segundo valor (" + valor2 + ") es inválido. No se puede dividir por 0");
        }
        return (valor1 / valor2);
    }

}
