package day0113;

public class Market {
	private String sangName;
	private int su;
	private int dan;
	private int total;
	
	//디폴트 
	public Market() {
		
	}
	
	public Market(String sang,int su, int dan) {
		this.sangName=sang;
		this.su=su;
		this.dan=dan;
		total= su*dan;
	}

	public String getSangName() {
		return sangName;
	}

	public void setSangName(String sangName) {
		this.sangName = sangName;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
