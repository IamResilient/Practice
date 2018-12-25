package by.gsu.mslab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONParser {      
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      return json;
	    } finally {
	      is.close();
	    }
	  }
	public static void main(String[] args) throws IOException, JSONException {
		JSONObject json = readJsonFromUrl("https://www.cbr-xml-daily.ru/daily_json.js");
		JSONObject valute = json.getJSONObject("Valute");
		final Iterator<String> iterable = valute.keys();
		while (iterable.hasNext()) {
			String key = iterable.next();
			if (valute.get(key) instanceof JSONObject) {
				System.out.println("ID: " + valute.getJSONObject(key).getString("ID"));
				System.out.println("CharCode: " + valute.getJSONObject(key).getString("CharCode"));
				System.out.println("Value: " + valute.getJSONObject(key).getDouble("Value"));
				System.out.println("----------------------------");
			}
		}
	}
}
