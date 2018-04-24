package Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class EOMU_Readjsonfile {

	public static void main(String[] args) throws org.json.simple.parser.ParseException {

		JSONParser parser = new JSONParser();

		try {
			JSONArray a = (JSONArray) parser.parse(new FileReader(EOMU_constants.JSON_FILEPATH));

			for (Object o : a) {
				JSONObject person = (JSONObject) o;

				String name = (String) person.get("name");
				System.out.println(name);

				String city = (String) person.get("city");
				System.out.println(city);

				String job = (String) person.get("job");
				System.out.println(job);

				JSONArray cars = (JSONArray) person.get("cars");

				for (Object c : cars) {
					System.out.println(c + "");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No such file found");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
