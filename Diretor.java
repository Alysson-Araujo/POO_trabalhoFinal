/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.funcionarios;
import model.Autentica;




/**
 *
 * @author Alysson
 */

import java.util.Date;

public class Diretor extends Gerente implements Autentica{

	public Diretor() {
		super();
	}

	public Diretor(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
		super(nome, departamento, salario, dataAdmissao, rg);
	}
	
	public double getBonificacao() {
		return this.salario * 0.20;
	}
}
