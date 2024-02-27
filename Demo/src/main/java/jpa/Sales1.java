package jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Sales1")
public class Sales1 {

	@Id
	@Column(name="Invno")
	private int Invno;
	
	@Column(name="Prodid")
	private int prodid;
	
	@Column(name="Transdate")
	private String Transdate;
	
	@Column(name="Qty")
	private int Qty;
	
	@Column(name="Amount")
	private double Amount;
	public int getInvno() {
		return Invno;
	}
	public void setInvno(int invno) {
		Invno = invno;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getTransdate() {
		return Transdate;
	}
	public void setTransdate(String transdate) {
		Transdate = transdate;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public double getPrice() {
		return Amount;
	}
	public void setPrice(double price) {
		this.Amount = price;
	}
	
}
