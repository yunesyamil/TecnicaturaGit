package condicionalejercicioif;

import java.util.Scanner;

/**
 *
 * @author Yamil
 */
public class CondicionalEjercicioIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Solicitamos al usuario una calificación
        System.out.println("Digite una calificación:" );
        var calificacion = Integer.parseInt(entrada.nextLine());
        
        if(calificacion >= 9 && calificacion <= 10){
            System.out.println("A");
        }
        else if (calificacion >= 8 && calificacion < 9){
            System.out.println("B");
        }
        else if (calificacion >= 7 && calificacion < 8){
            System.out.println("C");
        }
        else if (calificacion >= 6 && calificacion < 7){
            System.out.println("D");
        }
        else if (calificacion >= 0 && calificacion < 6){
            System.out.println("F");
        }else{
            // Imprimimos por pantalla la calificación correspondiente 
            System.out.println("Fuera de rango" );
        }  
    }
}

