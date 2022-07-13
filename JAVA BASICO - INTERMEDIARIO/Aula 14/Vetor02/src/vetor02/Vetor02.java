/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.LocalDate;

/**
 *
 * @author Usuário
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fv;
        String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        LocalDate  ano = LocalDate.now();
        int va = ano.getYear();
       
        if (va % 4==0 && va % 100!=0 || va % 400==0){
            fv = 29;
        }else{
            fv = 28;
        }
       
        int dia[] = {31,fv,31,30,31,30,31,31,30,31,30,31};
        
        for (int c=0;c<=mes.length-1;c++){
            System.out.println(mes[c]+" tem "+dia[c]+" Dias");
        }
    }
    
}
