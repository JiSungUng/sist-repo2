package day0110;

public class Sawon {
	private String sawonName;
	private int gibonPay, timeSu,familySu;
	
	//명시적 생성자
	public Sawon(String sName, int gPay, int tSu, int fSu) {
		this.sawonName =sName;
		this.gibonPay=gPay;
		this.timeSu=tSu;
		this.familySu = fSu;
	}
	

	public String getSawonName() {
		return sawonName;
	}

	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}

	public int getGibonPay() {
		return gibonPay;
	}

	public void setGibonPay(int gibonPay) {
		this.gibonPay = gibonPay;
	}

	public int getTimeSu() {
		return timeSu;
	}

	public void setTimeSu(int timeSu) {
		this.timeSu = timeSu;
	}

	public int getFamilySu() {
		return familySu;
	}

	public void setFamilySu(int familySu) {
		this.familySu = familySu;
	}
	//가족수당 3인 미만은 5만원 , 그 이상은 7만원
public int getFamilyPay() {
	int familyPay = 0;
	if(this.familySu<3)
		familyPay=50000;
	else
		familyPay=70000;
	
	return familyPay;
	
}
	//시간외 수당은 초과시간 당 2만원(단 5시간 이상은 무조건 10만원)
	public int getTimePay() {
		int timePay;
		if(this.timeSu<5)
			timePay=timeSu*20000;
		else timePay=100000;
		return timePay;
	}
	
	//총급여는 기본급과 수당을 더한것읜 90%만 제공됨 (10%는 세금공제)
	public int getTotalPay() {
		int totalPay;
		totalPay=(int)(this.gibonPay+getTimePay()+getFamilyPay()*0.9);
		return totalPay;
	}
}
