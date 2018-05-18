package by.gsu.mslab1;

public class Music {
	
	private String name;
	private int copies;
	private String possibility;
	
	public Music(String name, int copies, String possibility) {
		super();
		this.name = name;
		this.copies = copies;
		this.possibility = possibility;
	}
	
	public Music() {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCopies() {
		return copies;
	}
	
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public String getPossibility() {
		return possibility;
	}
	
	public void setPossibility(String possibility) {
		this.possibility = possibility;
	}
	
	public String toString() {
		return name + ";" + copies + ";" + possibility;
	}
}
