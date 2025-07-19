import java.util.Scanner;
/**
 * Clase que representa un menú para operar una calculadora básica.
 * Permite al usuario realizar suma, resta, multiplicación y división.
 * @author Ivo Narváez
 * @version 1.0
 */
public class MenuCalculadora {

    private final Calculadora operando;
    private final Scanner lector = new Scanner(System.in);

    public MenuCalculadora(){
        operando = new Calculadora();
    }

    /**
     * Inicia el menú de opciones de la calculadora.
     * Precondición: ninguna.
     * Postcondición: el programa ejecuta operaciones hasta que el usuario elija salir.
     */
    public void iniciarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n Menu Calculadora");
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);

            System.out.print("Ingrese una opción: ");
            try {
                int opcion = Integer.parseInt(lector.nextLine());

                double valor1 = 0;
                double valor2 = 0;
                double resultado;

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el valor 1: ");
                    valor1 = Double.parseDouble(lector.nextLine());
                    System.out.print("Ingrese el valor 2: ");
                    valor2 = Double.parseDouble(lector.nextLine());
                }

                switch (opcion) {
                    case 1 -> {
                        resultado = operando.suma(valor1,valor2);
                        System.out.println("Resultado: " + resultado);
                    }
                    case 2 -> {
                        resultado = operando.resta(valor1,valor2);
                        System.out.println("Resultado: " + resultado);
                    }
                    case 3 -> {
                        resultado = operando.multiplicacion(valor1,valor2);
                        System.out.println("Resultado: " + resultado);
                    }
                    case 4 -> {
                        resultado = operando.division(valor1,valor2);
                        System.out.println("Resultado: " + resultado);
                    }
                    case 5 -> {
                        System.out.println("Saliendo...");
                        continuar = false;
                    }
                    default -> System.out.println("Opción inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Asegúrese de ingresar números enteros.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }
    }
}

