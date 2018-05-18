import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Runner {
    	
	public static void main(String[] arg) {
		
		Scanner scanner;
		try {
			scanner = new Scanner(new File("G:\\java_project\\by.gsu.mslab3\\src\\text.txt"));
			String str = scanner.useDelimiter("\\A").next();
			scanner.close();

			String start = str.substring(0, str.indexOf(".")); 
			String end = str.substring(str.indexOf(".")+1); 
		 
			String[] word = start.replaceAll(",|:|\\(|\\)", "").split(" "); 
		        
			ArrayList<String> yesWord = new ArrayList<String>(); 
			ArrayList<String> noWord = new ArrayList<String>(); 
		 
		        for (String s : word){
		            if (end.contains(s)){ 
		                yesWord.add(s);
		            }
		            else {
		                noWord.add(s);
		            }
		        }
		        System.out.println("Answer" + noWord);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	    }
}

