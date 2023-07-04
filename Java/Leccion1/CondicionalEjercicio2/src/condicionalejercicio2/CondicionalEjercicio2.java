
package condicionalejercicio2;

import java.util.Scanner;

/**
 *
 * @author Yamil
 */
public class CondicionalEjercicio2 {

    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        //Solicitamos al usuario el mes 
        System.out.println("Digite el mes en el que se encuentra: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "No se encuentra la estación";
        //Según el mes se le asigna el valor de la estación a la variable estacion
        switch(mes){
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
           case 10: case 11: case 12:
                estacion = "Primavera";
                break;
            default:
                estacion = "Por favor indique bien el mes";
        }
        //Mostramos por pantalla el resultado según la opción elegida
        System.out.println(estacion );
    } 
}
