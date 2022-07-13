/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo02;


public class AulaPoo02 {

    
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
   
        c1.cor = "Vermelho";
        c1.ponta = 0.7f;
        c1.tampada = false;
        c1.modelo = "Bic";
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        System.out.println("");
        
        Caneta c2 = new Caneta();
       
        c2.carga = 90;
        c2.cor = "Azul";
        c2.modelo = "Fabre";
        c2.ponta = 1.0f;
        c2.tampada = true;
        c2.status();
        c2.destampar();
        c2.rabiscar();
        
    }
    
}
