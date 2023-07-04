package condicionalejercicio1;

import java.util.Scanner;
/**
 *
 * @author Yamil
 */
public class CondicionalEjercicio1 {

    public static void main(String[] args) {
        //Ejercicio1 Estaciones del año
        //Armar un programa que  según el mes digitado nos indique en qué estación
        //del año se encuentra el usuario
        Scanner entrada = new Scanner(System.in);
        //Solicitamos al usuario el mes 
        System.out.println("Digite un mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";
        
        if (mes == 1 || mes == 2 || mes == 3){
            estacion = "Verano";
        }
        else if (mes == 4 || mes == 5 || mes == 6){
            estacion = "Otoño";
        }
        else if (mes == 7 || mes == 8 || mes == 9){
            estacion = "Invierno";
        }
        else if (mes == 10 || mes == 11 || mes == 12){
            estacion = "Primavera";
        }else{
            System.out.println(estacion );
        }
        //Imprimimos por pantalla la estación
        System.out.println("La estación del año es = " + estacion);  
    }    
}
