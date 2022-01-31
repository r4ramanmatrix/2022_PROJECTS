package maps;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_Class {

	static Properties prop;

	public static void main(String[] args) {
		prop = new Properties();
		try {
			FileReader f = new FileReader(new File("E:\\fundamentals\\src\\maps\\property.properties"));
			prop.load(f);
			System.out.println(prop.getProperty("username"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
