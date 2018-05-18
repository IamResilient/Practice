import java.util.Arrays;

import by.gsu.mslab1.ComparatorInt;
import by.gsu.mslab1.ComparatorString;
import by.gsu.mslab1.Music;

public class Runner {
	public static void main(String[] args) {

		final Music[] songs = new Music[10];

		songs[0] = new Music("Not from the begining", 50000, "yes");
		songs[1] = new Music("What did you become", 25000, "no");
		songs[2] = new Music("Just a writer", 50000, "yes");
		songs[3] = new Music("Interlaced", 25000, "no");
		songs[4] = new Music("Lullaby", 50000, "yes");
		songs[5] = new Music("Butts", 25000, "no");
		songs[6] = new Music("The day before", 50000, "yes");
		songs[7] = new Music("Word of the mayor", 25000, "no");
		songs[8] = new Music("Ivory tower", 50000, "yes");
		songs[9] = new Music("Where we are not", 25000, "no");

		for (int i = 0; i < songs.length; i++) {
			System.out.println(songs[i]);
		}

		System.out.println("=================================");

		Arrays.sort(songs, new ComparatorInt());
		for (int i = 0; i < songs.length; i++) {
			System.out.println(songs[i]);
		}

		System.out.println("=================================");

		Arrays.sort(songs, new ComparatorString());
		for (int i = 0; i < songs.length; i++) {
			System.out.println(songs[i]);
		}

		System.out.println("=================================");

		int mp3 = 0;

		for (final Music song : songs) {
			if (song.getPossibility() == "yes") {
				++mp3;
			}
		}

		System.out.println("Number of mp3 = " + mp3);
		System.out.println("=================================");

		int summCopies = 0;
		for (final Music song : songs) {
			summCopies += song.getCopies();

		}
		System.out.println("Mean copies it all songs = " + summCopies / songs.length + "copies");
	}

}
