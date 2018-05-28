import by.gsu.mslab4.*;
import java.io.*;
import java.util.Scanner;
import java.lang.IllegalStateException;

public class Runner {

	public static void main(String[] args) throws Exception{
		int[] a;
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = scan.nextInt();
		a = new int[n];
		
		for (int i = 0;i < n;i++) {
		System.out.println("Enter the name: ");
		String name = scan.next();
		System.out.println("Enter the copie: ");
		int copies = scan.nextInt();
		System.out.println("Enter the possibility: ");
		String possibility = scan.next();
		scan.close();
		
		Music song = new Music (name, copies, possibility);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.txt"));
		out.writeObject(song);
		out.flush();
		out.close();
		
		ObjectInputStream in =  new ObjectInputStream (new FileInputStream("file1.txt"));
		Music m = (Music)in.readObject();
		System.out.println(m.toString());
		in.close();	
		}
	}
}