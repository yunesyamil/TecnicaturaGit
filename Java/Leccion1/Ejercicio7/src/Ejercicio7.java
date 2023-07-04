import java.util.Scanner;

/**
 *
 * @author Yamil
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        // Salario fijo de vendedores
        final int salario = 1000;
        float  valorAuto, porcentajeV, totalPrecio, salarioMensual;
        int comision = 150, autosVendidos;
        // Solicitamos la cantidad de autos vendidos
        System.out.println("Digite la cantidad de autos vendidos: ");
        autosVendidos = Integer.parseInt(entrada.nextLine());
        // El valor de cada auto
        System.out.println("Digite el valor de un auto: " );
        valorAuto = Float.parseFloat(entrada.nextLine());
        
        // Comisión por cada venta
        comision *= autosVendidos;
        // Total
        totalPrecio = autosVendidos * valorAuto;
        // Porcentaje del 5%
        porcentajeV = totalPrecio * 0.05f;        
        // Salario mensual
        salarioMensual = salario + comision + porcentajeV;
        
            
        //Imprimos por pantalla el resultado 
        System.out.println("La cantidad de autos vendidos es: " + autosVendidos + ", por lo tanto el salario será de: " + salarioMensual);
        // TODO code application logic here
    }
    
}
