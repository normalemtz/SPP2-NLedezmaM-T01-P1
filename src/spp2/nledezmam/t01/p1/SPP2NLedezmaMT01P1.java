/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.t01.p1;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Calculadora de promedio");
         //Variables
         int mat; //matricula
         double cal1, cal2, cal3, cal4, cal5; //calificaciones
         String res; // resultado
         double pro; //promedio
         
         //Objeto para recibir datos.
        Scanner tecl = new Scanner (System.in);
        //Asignar valores
        System.out.println("Introduce la matrícula:");
        mat=tecl.nextInt();
        System.out.println("Introduce la calificación #1:");
        cal1=tecl.nextDouble();
        System.out.println("Introduce la calificación #2:");
        cal2=tecl.nextDouble();
        System.out.println("Introduce la calificación #3:");
        cal3=tecl.nextDouble();
        System.out.println("Introduce la calificación #4:");
        cal4=tecl.nextDouble();
        System.out.println("Introduce la calificación #5:");
        cal5=tecl.nextDouble();
        
        //Operación
        pro = (cal1 + cal2 + cal3 + cal4 + cal5) / 5 ;
        
        //Clasificar
        if (pro > 7) {
               res = "APROBADO";  
         }else 
            res = "REPROBADO";
        
        //Mostrar resultado
        System.out.println("El alumno "+mat+" tiene un promedio de "+pro+" por lo tanto esta "+ res);
}
    }
    
