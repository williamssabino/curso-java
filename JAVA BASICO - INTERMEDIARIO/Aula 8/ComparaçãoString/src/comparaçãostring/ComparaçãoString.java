/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparaçãostring;

/**
 *
 * @author Usuário
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Williams";
        String nome2 = "Williams";
        String nome3 = new String("Williams");
        String res;
        //res = (nome1==nome2)? "Igual": "Diferente"; // Comparação variavel comum pode ser por '=='
        res = (nome1.equals(nome3))? "Igual":"diferente"; //comoparar string objeto
        System.out.println(res);
    }
    
}
