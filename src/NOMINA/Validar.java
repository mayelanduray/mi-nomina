/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NOMINA;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayela
 */
class Validar {
    
    public boolean campovacio(Component c,String texto){
     
        if(texto.equals("")){
          JOptionPane.showMessageDialog(c,"Debe llenar este campo");
          return true;
        }   
        return false;
    }
     public void sololetra(java.awt.event.KeyEvent evt,char c){
      
         if(!Character.isLetter(c)&&!Character.isSpaceChar(c)){evt.consume();}
    }
     public void solonumero(java.awt.event.KeyEvent evt,char c,String t){
         
         if(!Character.isDigit(c) && (!(c==KeyEvent.VK_PERIOD))){
             evt.consume();
         }
         if(c==KeyEvent.VK_PERIOD){
             if(t.indexOf(".")>=0){
                 evt.consume();
             }
         }
     }
         public void años(java.awt.event.KeyEvent evt,char c,String t){
            if(!Character.isDigit(c)){
             evt.consume();
         } 
         }
     
    
         public void validarpunto(java.awt.event.KeyEvent evt,char c){
           if(!Character.isDigit(c) ){
             evt.consume();
         } 
         }

    
    
}
