package co.simplon.springboot.simplecrud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "film")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private String name;
	
	private String year;
	
	private int rate;
	
	//
	// il existe plusieurs relations JPA qui sont :
	//  @OneToMany
	//  @ManyToOne
	//  @ManyToMany
	//
	// Creer une cle etrangere ref_acteur sur la table film
	//
	@ManyToOne
	@JoinColumn(name = "ref_acteur", table = "film")
	private Acteur  ref_acteur;

	public long getId_film() {
		return id;
	}

	public void setId_film(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Acteur getRef_acteur() {
		return ref_acteur;
	}

	public void setRef_acteur(Acteur ref_acteur) {
		this.ref_acteur = ref_acteur;
	}
}