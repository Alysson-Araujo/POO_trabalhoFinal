/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agencia;

import exec.Banco;
import model.geralconta.Conta;
import model.tiposclientes.Cliente;

/**
 *
 * @author Alysson
 */
public class Agencia {
        
	private Cliente [] clientes;
	private Conta [] contas;
        private String nome;
	private Banco banco;
        
        public Agencia(int numClientes, int numDeContas, String nomeDaAgencia, Banco banco){
            this.nome = nomeDaAgencia;
            this.banco = banco;
            
            this.clientes = new Cliente[numClientes];
            this.contas = new Conta[numDeContas];
            
        }
        
        public Agencia(){}

        public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}


	public Banco getBanco()
	{
		return this.banco;
	}
 }
