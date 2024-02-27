package jdbc;

public class products {

	private String prodName, price, catdesc;

	public products() {
		super();
	}

	public products(String prodName, String price, String catdesc) {
		super();
		this.prodName = prodName;
		this.price = price;
		this.catdesc = catdesc;
	}

	public String getProdname() {
		return prodName;
	}

	public void setProdname(String prodName) {
		this.prodName = prodName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCatdesc() {
		return catdesc;
	}

	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}

}