


package javaapplication1;


 import java.util.Scanner;

public class JavaApplication1 {

                                                                             
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese las hora de llegada");
         int ingreso = sc.nextInt();
        
        System.out.println("Ingrese las hora de salida");
        int salida = sc.nextInt();
        
        
        boolean BD1 = false;
        boolean BD2 = false;
        boolean BD3 = false;
        
        if ((ingreso <= 24) && (ingreso >= 0)){
            BD1 = true;
            
        } else {
           System.out.println("Hora de llegada invalida"); }
        
        
        if ((salida <= 24) && (salida >= 0)){
            BD2 = true;
            
        } else {
           System.out.println("Hora de salida invalida"); }
        
        
         if ((ingreso <= salida )){
            BD3 = true;
            
        } else {
           System.out.println("La hora de ingreso no puede ser mayor a la de la salida"); }
         
         
         
               
        
        if ((BD1 == true) && (BD2 == true) && (BD3 == true)){
          
            
            int rt = (salida-ingreso);
            int pr1 = 1000;
            int pr2 = 600;
            
            int res = (1*pr1)+(rt*pr2);
            System.out.println("Precio total es: " + res); 
            
             
            
        } else {
           System.out.println("No fue posible calcular el total"); }
        
        
        
        
        
            
        
        
        
        
    }
    
}
