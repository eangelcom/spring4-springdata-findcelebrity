package com.mycompany.findthecelebrity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Matrix {

	private @Id @GeneratedValue Long id;
	
	private Boolean known;
	
	@ManyToOne
	private Party party;
	
	public Matrix() {
		
	}

	public Matrix(Boolean known, Party party) {
		this.known = known;
		this.party = party;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getKnown() {
		return known;
	}

	public void setKnown(Boolean known) {
		this.known = known;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}
	
}
