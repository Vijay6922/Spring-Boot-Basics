package jdbcDemo;

public class categories {

	private String catcode;
	private String catdesc;
	
	public categories() {
		super();
	}
	public categories(String catcode, String catdesc) {
		super();
		this.catcode = catcode;
		this.catdesc = catdesc;
	}
	public String getCatcode() {
		return catcode;
	}
	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}
	public String getCatdesc() {
		return catdesc;
	}
	public void setCatdesc(String catdesc) {
		this.catdesc = catdesc;
	}
	
	
}
