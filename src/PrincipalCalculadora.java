/**
 * Clase principal que contiene el método main para ejecutar la calculadora.
 * Esta clase crea una instancia de MenuCalculadora y llama a su método
 * iniciarMenu() para iniciar la interacción con el usuario.
 * @author Ivo Narváez
 * @version 1.0
 */
public class PrincipalCalculadora {
    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args){
        MenuCalculadora calcular = new MenuCalculadora();

        calcular.iniciarMenu();
    }

}
