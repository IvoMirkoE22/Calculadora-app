import java.util.Scanner;

public class MenuCalculadora {

    private final Scanner lector = new Scanner(System.in);

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

                int valor1 = 0;
                int valor2 = 0;

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el valor 1: ");
                    valor1 = Integer.parseInt(lector.nextLine());
                    System.out.print("Ingrese el valor 2: ");
                    valor2 = Integer.parseInt(lector.nextLine());
                }

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + (valor1 + valor2));
                    case 2 -> System.out.println("Resultado: " + (valor1 - valor2));
                    case 3 -> System.out.println("Resultado: " + (valor1 * valor2));
                    case 4 -> {
                        if (valor2 != 0) {
                            System.out.println("Resultado: " + ((double) valor1 / valor2));
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
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

