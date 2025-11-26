/*
 Este programa genera el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia = 3

 Agregar los cambios necesarios para que tanto número y potencia 
 sean ingresados por teclado por el usuario.
 */
package ejemplos02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese la base para el proceso:");
        int numero = entrada.nextInt();
       
        System.out.println("Ingrese la potencia para el proceso:");
        int potencia = entrada.nextInt();
        // 6. resultado, i[0, n]
        int resultado;

        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("El resultado es:\n%d\n", resultado);
    }
}
