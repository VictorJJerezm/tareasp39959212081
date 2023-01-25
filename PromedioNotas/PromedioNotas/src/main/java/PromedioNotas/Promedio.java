/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PromedioNotas;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);

        int [] prome;
        prome = new int[20];

        int i;
        float total = 0;
        for(i = 0;i<20;++i)
        {
            System.out.print("Ingrese la calificacion del alumno "+i+": ");
            prome[i] = teclado.nextInt();
           total = total + prome[i];
        }
        total= total/20;
        System.out.println("El promedio general es de: "+total);  
    }   //Se borra codigo que sobrecarcaba la vista y mostraba información innecesaria.   
}
