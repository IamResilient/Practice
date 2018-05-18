package classes1;

public class BusinessTrip {

	public static final int rate=500;
	private String account;
	private int transport;
	private int days;	
	public BusinessTrip() { 
		super(); 
	} 
	
	public BusinessTrip (String account, int transport, int days) {
	this.account = account;
	this.transport = transport;
	this.days = days;
	
}
	
	public String getAccount() {
		return account;
	}
	
	public void setAccount(String account){
		this.account = account;
	}
	
	public int getTransport() {
		return transport;
	}
	
	public void setTransport(int transport) {
		this.transport = transport;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public int getTotal() {
		return transport+rate*days;
	}
	
	public String toString() {
		return rate/100+"."+rate%100+";"+account+";"+transport/100+"."+transport%100+";"+days+";"+getTotal()/100+"."+getTotal()%100;
	}
	
	public void show() {
		System.out.println("====================");
		System.out.println("rate = "+rate/100+"."+rate%100);
		System.out.println("account = "+account);
		System.out.println("transport = "+transport/100+"."+transport%100);
		System.out.println("days = "+days);
		System.out.println("total = "+getTotal()/100+"."+getTotal()%100);
	}		
}
	
	
	
	
