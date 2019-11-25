/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.funcionarios;

/**
 *
 * @author Alysson
 */

import java.util.Date;
import model.Autentica;
import model.tiposfuncionarios.Funcionario;


public class Gerente extends Funcionario implements Autentica{

	private int senha;
        private int numDeFuncionarios;
        
        
        
        
	public Gerente() {
		super();
	}

	public Gerente(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
        @Override
	public double getBonificacao() {
            return super.getBonificacao() + 128;
	}

	@Override
	public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
}
