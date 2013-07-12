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
 * Compra generated by hbm2java
 */
@Entity
@Table(name = "compra", catalog = "concessionaria")
public class Compra implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2274512512481563225L;
	private Integer idcompra;
	private Funcionario funcionario;
	private Veiculo veiculo;
	private Date datacompra;
	private Date valorcompra;

	public Compra() {
	}

	public Compra(Funcionario funcionario, Veiculo veiculo) {
		this.funcionario = funcionario;
		this.veiculo = veiculo;
	}

	public Compra(Funcionario funcionario, Veiculo veiculo, Date datacompra,
			Date valorcompra) {
		this.funcionario = funcionario;
		this.veiculo = veiculo;
		this.datacompra = datacompra;
		this.valorcompra = valorcompra;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idcompra", unique = true, nullable = false)
	public Integer getIdcompra() {
		return this.idcompra;
	}

	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
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
	@Column(name = "datacompra", length = 10)
	public Date getDatacompra() {
		return this.datacompra;
	}

	public void setDatacompra(Date datacompra) {
		this.datacompra = datacompra;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "valorcompra", length = 10)
	public Date getValorcompra() {
		return this.valorcompra;
	}

	public void setValorcompra(Date valorcompra) {
		this.valorcompra = valorcompra;
	}

}
