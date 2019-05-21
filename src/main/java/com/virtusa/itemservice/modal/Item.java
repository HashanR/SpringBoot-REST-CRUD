package com.virtusa.itemservice.modal;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//many
@Entity
public class Item {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private BigDecimal unitPrice;
	private BigDecimal salesPrice;
	private String unitOfmeasure;
	
	@ManyToOne
	@JoinColumn
	private Types type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getUnitOfmeasure() {
		return unitOfmeasure;
	}

	public void setUnitOfmeasure(String unitOfmeasure) {
		this.unitOfmeasure = unitOfmeasure;
	}

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}
	
	
	

}
