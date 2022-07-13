/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao01;

/**
 *
 * @author Usuário
 */
public class Fatorial {
   
       private int num = 0;
       private int fact = 1;
       private String formula = "";
    
    public void setValor(int n){
        num = n; 
        int f = 1;
        String s = "";
        
        for (int cc=n; cc>1;cc--){
            
            f *= cc;
            s += cc+ " X ";
        }
        
        s+= "1= ";
        fact = f;
        formula = s;
                
    }
    public int getFatorial(){
        return fact;
        
    }
    
    public String getFormula(){
        return formula;
    }
    
}
