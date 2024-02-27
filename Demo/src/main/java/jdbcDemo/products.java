package jdbcDemo;


public class products {

	public products() {
		super();
	}
	public products(int prodid, String prodname) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
	}
	private int prodid;
	private String prodname;
	private double price;
	private int Qoh;
	private String remarks;
	private String Catcode;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQoh() {
		return Qoh;
	}
	public void setQoh(int qoh) {
		Qoh = qoh;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getCatcode() {
		return Catcode;
	}
	public void setCatcode(String catcode) {
		Catcode = catcode;
	}
	
	 
}
