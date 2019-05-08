package com.stefanini.projeto.model;

import com.stefanini.projeto.exception.TreinaException;
import org.aspectj.lang.annotation.AfterThrowing;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pai implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SQ_PA_NU", sequenceName = "SQ_DN_NU", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PA_NU")
	@Column(name = "PA_NU")
	private Long id;

	@Column(name = "PA_NO", length = 20, nullable = false)
	private String nome;

	@OneToMany(mappedBy = "pai", cascade = CascadeType.ALL)
	private List<Filho> filhos;

	public Pai() {
		super();
	}

	public Pai(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public List<Filho> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Filho> filhos) {
		this.filhos = filhos;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Pai other = (Pai) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}