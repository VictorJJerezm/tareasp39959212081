/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import javax.swing.JFrame; // Se agrega import para ventana emergente
import javax.swing.JOptionPane;

/**
 *
 * @author daguilae
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float opc = 0,dato1 = 0,dato2 = 0,result = 0;
        //se agrega ventana emergente 
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "OPERACIONES BASICAS");
        //Agregar en la ventana emergente las opciones a elegír
        opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n1.-sumar    2.-restar   3.-multiplicar  4.-dividir  otro.-salir "));

        if(opc>0&&opc<5){
            dato1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
            dato2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: ")); //Se elimino palabra duplicada
        if(opc!=0){
            if(opc==1)
                result=dato1+dato2;
            if(opc==2)
                result=dato1-dato2;
            if(opc==3)
                result=dato1*dato2;
            if(opc==4)
                result=dato1/dato2;
        }
        JOptionPane.showMessageDialog(null, "el resultado es: "+result);
        }
            JOptionPane.showMessageDialog(null,"adios");        
    }
    
}
