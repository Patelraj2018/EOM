package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EOMU_Loadconfigfile {

	public static void main(String[] args) {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(EOMU_constants.CONFIG_FILEPATH);

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("APPLICATION"));
			System.out.println(prop.getProperty("MACHINE"));
			System.out.println(prop.getProperty("CLOSE_BROWSER"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
