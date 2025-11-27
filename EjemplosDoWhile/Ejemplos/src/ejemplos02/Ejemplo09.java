/*
 Revise la solución presentada y modifique de tal forma
 que se pueda tener el siguiente reporte

Listado de Notas
Calificación 10 (Muy buena) del estudiante rené
Calificación 4 (Buena) del estudiante rolando

Promedio de calificaciones: 8,50

---
Si la nota es mayor o igual a 5 es un nota "Muy buena", caso contrario es buena
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadenaFinal;
        int nota;
        int salida;
        String nombre; // *
        double promedio;
        boolean bandera = true;
        int suma = 0;
        String estado = "";
        int contador_calificaciones = 0;

        cadenaFinal = "Listado de Notas\n";

        do {
            System.out.println("Ingrese su nombre por favor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su nota por favor");
            nota = entrada.nextInt();
            // agrego valor al acumulador
            suma = suma + nota;
            // agrego una unidad al contador para luego sacar el promedio
            contador_calificaciones = contador_calificaciones + 1;

            if ((nota >= 5) && (nota <= 10)) {
                estado = "Muy buena";

            } else {
                estado = "Buena";
            }
            cadenaFinal = String.format("%sCalificacion %d (%s) del estudiante"
                    + " %s\n",
                    cadenaFinal,
                    nota,
                    estado,
                    nombre);
            System.out.println("Ingrese (-111) si desea salir del ciclo; "
                    + "o cualquier otro número para continuar");
            salida = entrada.nextInt();

            if (salida == -111) {
                bandera = false;
            }
            entrada.nextLine(); 


        } while (bandera); // (bandera==true)
        // promedio = suma / contador_calificaciones;
        promedio = suma / contador_calificaciones;
        cadenaFinal = String.format("%s\n"
                + "Promedio de calificaciones: %.2f",
                cadenaFinal,
                promedio);
        System.out.printf("%s\n", cadenaFinal);
    }
}
