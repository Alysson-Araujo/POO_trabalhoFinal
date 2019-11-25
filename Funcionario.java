/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.tiposfuncionarios;

/**
 *
 * @author Alysson
 */
import java.util.Date;
import exec.Banco;

public class Funcionario extends Banco {
	protected String nome;
	protected String departamento;
	protected double salario;
	protected Date dataAdmissao;
	protected String rg;
	
	public Funcionario(){
		
    }
 
    public Funcionario(String nome, String departamento, double salario, Date dataAdmissao, String rg) {
    	this.nome = nome;
    	this.departamento = departamento;
    	this.salario = salario;
    	this.dataAdmissao = dataAdmissao;
    	this.rg = rg;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAdmissao == null) ? 0 : dataAdmissao.hashCode());
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (dataAdmissao == null) {
			if (other.dataAdmissao != null)
				return false;
		} else if (!dataAdmissao.equals(other.dataAdmissao))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
           
        public double getBonificacao(){
            return this.salario * 0.10;        
        }
        
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double recebeAumento() {
		return 0; //ver depois
	}
	
	public double getGanhoAnual() {
		return 0; //ver depois
	}

	

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", departamento=" + departamento + ", salario=" + salario
				+ ", dataAdmissao=" + dataAdmissao + ", rg=" + rg + "]";
	}

}
