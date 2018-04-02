package hello.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class LoginService {
	public boolean validateUser(String userid, String password) {
		Map loginDetails = getProperties();

		return userid.equalsIgnoreCase((String) loginDetails.get("username"))
				&& password.equalsIgnoreCase((String) loginDetails.get("password"));

		//return true;
	}

	public static Map getProperties() {
		Properties prop = new Properties();
		InputStream input = null;

		Map<String, String> map = null;

		try {

			input = new FileInputStream("C:\\Users\\reddy\\Documents\\workspace-sts\\spring-boot-sample-web-jsp\\src\\main\\resources\\LoginDetails.properties");

			// load a properties file
			prop.load(input);
			map = (Map) prop;
			return map;

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
		return map;
	}
}