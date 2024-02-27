package jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {

	@Id
	@Column(name="Prodid")
	private int prodid;
	
	@Column(name="ProdName")
	private String prodName;
	@Column(name="Price")
	private float price;
	@Column(name="Qoh")
	private int Qty;
	@Column(name="Remarks")
	private int Remarks;
	@Column(name="CatCode")
	private int catCode;
	@Column(name="orders_id")
	private int orders_id;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public int getRemarks() {
		return Remarks;
	}
	public void setRemarks(int remarks) {
		Remarks = remarks;
	}
	public int getCatCode() {
		return catCode;
	}
	public void setCatCode(int catCode) {
		this.catCode = catCode;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	
	
	
}
