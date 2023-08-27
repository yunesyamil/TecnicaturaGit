
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        
        // CICLO WHILE 
        System.out.println("*** Ciclo While ***");
        var conteo = 0; //inferencia de tipos
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //vamos aumentando en uno la variable
        }
        
       // CICLO DO - WHILE
       System.out.println("*** Ciclo Do-While ***");

       var contador = 0;
       do{
           System.out.println("contador = " + contador); 
           contador++;
       }while(contador <= 7);
       
       // CICLO FOR
       System.out.println("*** Ciclo For ***");

       for(var contando = 0; contando < 7; contando++){
           System.out.println("contando = " + contando);
       }
    }
}
