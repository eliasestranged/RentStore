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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Promocao generated by hbm2java
 */
@Entity
@Table(name = "promocao", catalog = "concessionaria")
public class Promocao implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6131152290933540635L;
	private Integer idpromocao;
	private String nome;
	private String descricao;
	private Date datainicio;
	private Date datatermino;
	private Set<Pagamento> pagamentos = new HashSet<Pagamento>(0);

	public Promocao() {
	}

	public Promocao(String nome, String descricao, Date datainicio,
			Date datatermino, Set<Pagamento> pagamentos) {
		this.nome = nome;
		this.descricao = descricao;
		this.datainicio = datainicio;
		this.datatermino = datatermino;
		this.pagamentos = pagamentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idpromocao", unique = true, nullable = false)
	public Integer getIdpromocao() {
		return this.idpromocao;
	}

	public void setIdpromocao(Integer idpromocao) {
		this.idpromocao = idpromocao;
	}

	@Column(name = "nome", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "descricao", length = 50)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datainicio", length = 10)
	public Date getDatainicio() {
		return this.datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datatermino", length = 10)
	public Date getDatatermino() {
		return this.datatermino;
	}

	public void setDatatermino(Date datatermino) {
		this.datatermino = datatermino;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promocao")
	public Set<Pagamento> getPagamentos() {
		return this.pagamentos;
	}

	public void setPagamentos(Set<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

}
