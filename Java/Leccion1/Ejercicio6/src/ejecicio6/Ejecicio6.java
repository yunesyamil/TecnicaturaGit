
package ejecicio6;

import java.util.Scanner;

/**
 *
 * @author Yamil
 */
public class Ejecicio6 {

    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
        //Definimos las variables como float
        float dolaresG,dolaresJ, dolaresL, resultado;
        //Pedimos al usuario la cantidad de dolares de Guillermo
        System.out.println("Digite la cantidad de dolares que posee Guillermo: ");
        dolaresG = Float.parseFloat(entrada.nextLine());
        //Realizamos las operaciones
        dolaresL = dolaresG / 2;
        dolaresJ = (dolaresG + dolaresL) / 2;
        resultado = dolaresG + dolaresL + dolaresJ;
        //Imprimimos el resultado del total
        System.out.println("El total de los dolares es: " + resultado);
    }  
}


