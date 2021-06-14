/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author UsuariO
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Matheus";
        String nome2 = "Matheus";
        String nome3 = new String("Matheus");
        String Res;
        Res = (nome1==nome3)?"igual":"diferente";
        System.out.println(Res);
                                
    }
    
}
