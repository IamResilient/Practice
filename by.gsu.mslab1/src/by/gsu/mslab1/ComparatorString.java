package by.gsu.mslab1;
import java.util.Comparator;

public class ComparatorString implements Comparator <Music>{
	public ComparatorString() {
		super();
	}

	public int compare(Music arg0, Music arg1) {

		return  arg0.getName().compareTo(arg1.getName()) ;
	}
}
