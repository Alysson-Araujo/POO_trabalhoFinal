/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alysson
 */

package exec;

import model.funcionarios.Gerente;
import model.geralconta.Conta;
import model.Autentica;
import model.tiposContas.ContaCorrente;
import model.tiposContas.ContaPoupanca;
import model.tiposclientes.Cliente;
import model.tiposfuncionarios.Funcionario;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Banco {
	private ArrayList<Funcionario> Funcionarios = new ArrayList<Funcionario>();
	private ArrayList<Cliente> Clientes= new ArrayList<Cliente>();
        private ArrayList<Gerente> Gerentes = new ArrayList<Gerente>();
        ArrayList<ContaPoupanca> ContaPoupanca = new ArrayList<ContaPoupanca>(); 
        
        protected String cnpj;
	
	public Banco() {      
        }
	
	public Banco(ArrayList<Funcionario> funcionarios, ArrayList<Cliente> clientes
                ,ArrayList<Gerente> gerentes, String cnpj){
		super();
		Funcionarios = funcionarios;
		Clientes = clientes;
                
                Gerentes = gerentes;
                this.cnpj = cnpj;
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		Funcionarios = funcionarios;
	}
	
        public ArrayList<Cliente> getClientes() {
		return Clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		Clientes = clientes;
	}
        
        public ArrayList<Gerente> getGerentes() {
		return Gerentes;
	}
	public void setGerentes(ArrayList<Gerente> gerentes) {
		Gerentes = gerentes;
	}
        
       
        
        public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
