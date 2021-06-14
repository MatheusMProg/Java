/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author UsuariO
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int n, s = 0;
      int total = 0;
      int par = -1;
      int impar = 0;
      int acima = 0;
      int media = 0;
        do {
         n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "<html>Informe um número:<br><em> (Valor 0 interrompe)</em></html>"));
        
         s+= n;
         if(n !=0) {
             total++;
         }
         if(n % 2 == 0) {
             par++;
         } else{
             impar++;
         }
         if(n>100) {
             acima++;
         }
         media = s / total;
         
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + 
                "<br>Somatório de Valores: " + s + "<br>" +
                "Total de Valores: " + total + "<br>" +
                "Total de Pares: " + par + "<br>" +
                "Total de Ímpares: " + impar + "<br>" +
                "Acima de 100: " + acima + "<br>" +
                "Média dos Valores: " + media + "</br>"+"</html>");
       
    }
    
}
