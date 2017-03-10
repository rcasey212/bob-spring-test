package org.bob.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 * Created by rcasey on 3/10/2017.
 */
@Entity
public class CandyBar {

	@Id
	private int candyId;

	private String name;
	private float price;
	private float weight;

	@Enumerated(EnumType.STRING)
	private CandyType candyType;


	public int getCandyId() {
		return candyId;
	}

	public void setCandyId(int candyId) {
		this.candyId = candyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public CandyType getCandyType() {
		return candyType;
	}

	public void setCandyType(CandyType candyType) {
		this.candyType = candyType;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
