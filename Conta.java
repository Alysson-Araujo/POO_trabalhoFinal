/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.geralconta;

/**
 *
 * @author Alysson
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import model.tiposclientes.Cliente;

public class Conta {
    //Eu usei static no quantidadeDeContas pois quero guardar a quantidade de contas criadas e se não tivesse o static
    // toda vez que fosse criada uma nova conta, o valor iria se manter em 1.
    //private static int quantidadeDeContas;
    protected int numero;
    private double saldo;
    protected double limite;
        //protected int saques;
    private String titular;






        //Isso foi criado com a intenção de avisar ao usuário que a conta foi criada com sucesso!
        public Conta(){
        System.out.println("Nova conta criada com sucesso!");
        }

        public Conta(int numero, String titular, double saldo){ 
		this.numero = numero;
		this.titular = titular;
                this.saldo = saldo;
		
	}

    public Conta(String aux) {
        throw new UnsupportedOperationException("Inválido."); //To change body of generated methods, choose Tools | Templates.
    }
	
    public boolean sacar(double valor){
        
        if(valor<0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo. Por favor, digite valores que sejam positivos");
            }
        if(saldo >= valor){
           saldo -= valor;
            //saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    
    public void depositar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo ou algum valor inválido. Por favor, digite valores que sejam positivos.");
        }
        else{
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
}
    public void transfere(Conta destino, double valor) {
        if(valor<0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo. Por favor, digite valores que sejam positivos!");
        }    
        else{
        boolean retirou = this.sacar(valor);
        
        
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
}
 
    public void DadosBancarios(){
        System.out.println("");
        System.out.println("---Dados bancários---");
        System.out.println(" número" + this.numero);
        System.out.println(" titular" + this.titular);
        System.out.println(" saldo" + this.saldo);
        System.out.println(" fim dados bancários");
        System.out.println("");
                
}
    
    
    public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
        public double getSaldo(){
            return saldo;
        }
        
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

        public String setTitular(){
            return titular;
        }
        
        
        public void setTitular(String tilular){
            this.titular = titular;
   }
}
