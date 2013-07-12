package br.com.concessionaria.model;

// Generated 11/07/2013 17:45:57 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Motorista generated by hbm2java
 */
@Entity
@Table(name = "motorista", catalog = "concessionaria")
public class Motorista implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 618973632311840221L;
	private Integer idmotorista;
	private Pessoafisica pessoafisica;
	private String registro;
	private Date dataemissao;
	private Date datavalidade;
	private Set<Locacao> locacaos = new HashSet<Locacao>(0);

	public Motorista() {
	}

	public Motorista(Pessoafisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	public Motorista(Pessoafisica pessoafisica, String registro,
			Date dataemissao, Date datavalidade, Set<Locacao> locacaos) {
		this.pessoafisica = pessoafisica;
		this.registro = registro;
		this.dataemissao = dataemissao;
		this.datavalidade = datavalidade;
		this.locacaos = locacaos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idmotorista", unique = true, nullable = false)
	public Integer getIdmotorista() {
		return this.idmotorista;
	}

	public void setIdmotorista(Integer idmotorista) {
		this.idmotorista = idmotorista;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpessoafisica", nullable = false)
	public Pessoafisica getPessoafisica() {
		return this.pessoafisica;
	}

	public void setPessoafisica(Pessoafisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

	@Column(name = "registro", length = 15)
	public String getRegistro() {
		return this.registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataemissao", length = 10)
	public Date getDataemissao() {
		return this.dataemissao;
	}

	public void setDataemissao(Date dataemissao) {
		this.dataemissao = dataemissao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datavalidade", length = 10)
	public Date getDatavalidade() {
		return this.datavalidade;
	}

	public void setDatavalidade(Date datavalidade) {
		this.datavalidade = datavalidade;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "motorista")
	public Set<Locacao> getLocacaos() {
		return this.locacaos;
	}

	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacaos = locacaos;
	}

}