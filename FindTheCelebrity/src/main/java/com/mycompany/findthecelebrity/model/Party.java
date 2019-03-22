package com.mycompany.findthecelebrity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Party {

	private @Id @GeneratedValue Long id;
	
	private Integer matrixSize;
	
	public Party() {
		
	}

	public Party(Integer matrixSize) {
		this.matrixSize = matrixSize;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMatrixSize() {
		return matrixSize;
	}

	public void setMatrixSize(Integer matrixSize) {
		this.matrixSize = matrixSize;
	}
	
}
