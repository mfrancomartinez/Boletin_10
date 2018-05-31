/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class juego {
    int numero;
    int oportunidades;
    int i;
    public void game(){    
       
    numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero: "));
    oportunidades = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de oportunidades: "));
    
    if (numero<1 || numero>50){
        JOptionPane.showMessageDialog(null,"El jugador uno hace trampas");
    }else{
    
     for (i=0;i<oportunidades;i++){
          int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número: "));
          
          if(numero2 ==numero){
              JOptionPane.showMessageDialog(null,"Felicidades!! Has acertado.");break;
              
          }else{
              JOptionPane.showMessageDialog(null,"Fallaste, intentalo de nuevo.");
          }
        }
    }
    
    
    
    
       
    }
}
