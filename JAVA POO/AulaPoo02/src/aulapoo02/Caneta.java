/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo02;

/**
 *
 * @author Usuário
 */
public class Caneta {
    String modelo, cor;
    float ponta;
    int carga = 100 ;
    boolean tampada;
   
    void status(){
        System.out.println(this.carga+"%");
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println(this.ponta);
        System.out.println(this.tampada);
    }
    void rabiscar(){
        if (this.tampada==true){
            System.out.println("Erro");
        }else{
            System.out.println("Rabiscar");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
