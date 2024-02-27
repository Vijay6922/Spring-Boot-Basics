package Rest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products1")
public class products1 {

	@Id
	@Column
	private int prodid;
	@Column
	private String prodName;
	@Column
	private double price;
	@Column
	private int Qty;
	@Column
	private String Remarks;
	@Column
	private String catCode;
	
	public products1() {
		super();
	}
	public products1(int prodid, String prodName, double price, int qty, String remarks, String catCode) {
		super();
		this.prodid = prodid;
		this.prodName = prodName;
		this.price = price;
		Qty = qty;
		Remarks = remarks;
		this.catCode = catCode;
	}
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
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public String getCatCode() {
		return catCode;
	}
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	
	
	
	
}
