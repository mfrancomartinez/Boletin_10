/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class JuegoIA {
    int numero;
    int oportunidades;
    int i;
    public void gameIA(){    
       
    numero = (int)(Math.random()*50)+1;
    oportunidades = Integer.parseInt(JOptionPane.showInputDialog("Inserte la cantidad de oportunidades: "));  
    
    
     for (i=0;i<oportunidades;i++){
          int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el número: "));
          
          if(numero2 ==numero){
              JOptionPane.showMessageDialog(null,"Felicidades!! Has acertado.");break;
              
          }else if (numero2> (numero+20) || numero2<(numero-20)){
             JOptionPane.showMessageDialog(null, "Muy frío");
          }else if(numero2> (numero+10)&&numero2<=(numero+20)||numero2<(numero-10)&&numero2>=(numero-20)) {
              JOptionPane.showMessageDialog(null,"Frío");
        }else if(numero2> (numero+5)&&numero2<=(numero+10)||numero2<(numero-5)&&numero2>=(numero-10)){
            JOptionPane.showMessageDialog(null,"Caliente");
        }else if(numero2<= (numero+5) || numero2>=(numero-5)){
            JOptionPane.showMessageDialog(null,"Te quemas");
        }
    }
    }
}
