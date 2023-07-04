package condicionalejercicio3;

import java.util.Scanner;

/**
 *
 * @author Yamil
 */
public class CondicionalEjercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Solicitamos al usuario que ingrese una calificación
        System.out.println("Por favor ingrese un valor: " );
        var calificacion = Integer.parseInt(entrada.nextLine());
        var nota = "";
         switch(calificacion){
            case 10: case 9:
                nota = "A";
                break;
            case 8: 
                nota = "B";
                break;
            case 7:
                nota = "C";
                break;
            case 6:
                nota = "D";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                nota = "F";
                break;
            default:
                nota = "Por favor digite un valor correcto";
        }
        System.out.println(nota );
       
    }
    
}
