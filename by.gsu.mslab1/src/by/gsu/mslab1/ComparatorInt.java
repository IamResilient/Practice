package by.gsu.mslab1;
import java.util. *;

public class ComparatorInt implements Comparator <Music>{
	
	public ComparatorInt(){
		super();
	}
	
	public int compare(Music arg0, Music arg1){
		
		return (int)(arg0.getCopies() - arg1.getCopies());
	}
}


