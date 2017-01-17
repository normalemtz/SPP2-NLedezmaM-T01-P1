/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.imc;
//Agregar libreria, import
import java.util.Scanner;

/**
 *
 * @author falvizo
 */
public class SPP2IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        //Paso 1. Le digo a JAVA con qué variables trabajaré
        //Declaración de variables
        double p,e,imc; //p = peso, e = estatura, imc = indice de masa corporal
        //Objeto para recibir datos.
        Scanner entradaTeclado = new Scanner (System.in);
        
        //Paso 2. Asigno valores.
        System.out.println("Introduce el peso");
        p=entradaTeclado.nextDouble();
        System.out.println("Introduce la estatura");
        e=entradaTeclado.nextDouble();
        
        //Paso 3. Realizo la operación.
        imc = p / Math.pow(e,2);
        
        //Paso 3.1. Clasificar
        if (imc > 25){
            System.out.println("Estás en sobrepeso");
        }else if (imc < 18){
            System.out.println("Estás en desnutrición");
        }else {
            System.out.println("Estás en peso normal");
        }
        
        //Paso 4. Muestro el resultado
        System.out.println("El resultado es " + imc);
        
        
        
    }
    
}

