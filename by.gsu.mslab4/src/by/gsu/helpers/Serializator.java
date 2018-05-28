package by.gsu.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import by.gsu.exception.DeserializationException;

public class Serializator {

	public static <T> void serialize(T[] array, String fileName) throws IOException {
		File file = new File(fileName);

		try (OutputStream out = new FileOutputStream(file)) {
			if (out != null) {
				try (ObjectOutputStream fileOut = new ObjectOutputStream(out)) {
					fileOut.writeObject(array);
				}
			}
		}
	}

	public static <T> T[] deserialize(String fileName) throws DeserializationException {
		File file = new File(fileName);
		try (InputStream in = new FileInputStream(file); 
				ObjectInputStream fileIn = new ObjectInputStream(in)) {
			
			T[] drugstores = (T[]) fileIn.readObject();
			return drugstores;
		} catch (IOException | ClassNotFoundException e) {
			throw new DeserializationException("Deserialization error:" + e.getMessage());
		} 
	}
}