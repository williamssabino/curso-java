/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo05;



/**
 *
 * @author Usuário
 */
public class ContaBancaria {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBancaria() {
        this.saldo = 0;
        this.status = false;
    }
    
    
    public void abrirConta(String t){
        setTipo(t);
        this.status = true;
        if ("cp".equals(t)){ 
            setSaldo(150);
        }
        if ("cc".equals(t)){
            setSaldo(50);
        }
    }
    
    public void fecharConta(){
        if (this.saldo>0){
            System.out.println("Você precisa efetuar o saque para fechamento da conta");
        }
       
        else if(this.saldo<0){
            System.out.println("Sua conta esta em debito, impossivel solicitar fechamento! ");
        }
        
        else{
            System.out.println("Conta fechada com sucesso");
            this.status = false;
        }
        
    }
    
    public void depositar(float n){
        if (this.status == true){
            if (this.saldo<0){
                float soma = n - this.saldo;
                setSaldo(soma);
            }
            else{
                setSaldo(n+this.saldo);
            }
        } 
        else{
            System.out.println("Abra uma conta para efetuar um deposito!");
        }
    }
    
    public void sacar(float f){
        if(this.status==true){
            if(f<=this.saldo && this.saldo>0 && f>0){
                float sac = this.saldo - f;
                setSaldo(sac);
                System.out.println("Voce efetueou um saque de R$"+f);
                
            }
            else{
                System.out.println("Não foi possivel efetuaro saque ");
            }
            
        }
        else{
            System.out.println("Abra uma conta para efetuar um saque!");
        }
        
    }
    
    public void pagamnetoMensal(){
        if("cc".equals(this.tipo)){
            setSaldo(this.saldo - 12);
        }
        if("cp".equals(this.tipo)){
            setSaldo(this.saldo - 20);
        }
        
    }
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        System.out.println("Sua conta é: "+this.tipo);
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        System.out.println("seu saldo é: "+this.saldo);
        return saldo;
        
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}

//obs: trabablhar smepre com os metodos especiais ao inves de mexer diretamente no atributos