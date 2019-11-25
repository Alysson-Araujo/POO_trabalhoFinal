/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tiposContas;

import model.geralconta.Conta;

/**
 *
 * @author Alysson
 */


public class ContaPoupanca extends Conta{
        
	public ContaPoupanca(int numero, String titular, double saldo) {
		super.setTitular(titular);
                super.setNumero(numero);
                super.setLimite(500);
                super.setSaldo(saldo);
	}

    public ContaPoupanca(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public void gerarTaxa() {
	     double novo_saldo = getSaldo() * .006;
             setSaldo(novo_saldo);
	}
}
