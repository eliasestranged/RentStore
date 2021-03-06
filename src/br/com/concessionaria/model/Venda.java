package br.com.concessionaria.model;

// Generated 11/07/2013 17:45:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Venda generated by hbm2java
 */
@Entity
@Table(name = "venda", catalog = "concessionaria")
public class Venda implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7104485097912676388L;
	private Integer idvenda;
	private Funcionario funcionario;
	private Veiculo veiculo;
	private Date datavenda;
	private Date valorvenda;

	public Venda() {
	}

	public Venda(Funcionario funcionario, Veiculo veiculo) {
		this.funcionario = funcionario;
		this.veiculo = veiculo;
	}

	public Venda(Funcionario funcionario, Veiculo veiculo, Date datavenda,
			Date valorvenda) {
		this.funcionario = funcionario;
		this.veiculo = veiculo;
		this.datavenda = datavenda;
		this.valorvenda = valorvenda;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idvenda", unique = true, nullable = false)
	public Integer getIdvenda() {
		return this.idvenda;
	}

	public void setIdvenda(Integer idvenda) {
		this.idvenda = idvenda;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idfuncionario", nullable = false)
	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idveiculo", nullable = false)
	public Veiculo getVeiculo() {
		return this.veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datavenda", length = 10)
	public Date getDatavenda() {
		return this.datavenda;
	}

	public void setDatavenda(Date datavenda) {
		this.datavenda = datavenda;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "valorvenda", length = 10)
	public Date getValorvenda() {
		return this.valorvenda;
	}

	public void setValorvenda(Date valorvenda) {
		this.valorvenda = valorvenda;
	}

}
