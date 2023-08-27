/*
Ejercicio 1: Leer un numero y mostrar su cuadrado.
Repetir el procreso hasta que se introduzca un numero negativo
*/
package Ciclos01;

import javax.swing.JOptionPane;

public class Ejercicio01 {
    public static void main(String[] args) {
         int numero, cuadrado;
         numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){ // Mientras el numero sea positivo o cero
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));   
        }
        System.out.println("El programa ha finalizado por numero negativo. ");
    }
}
