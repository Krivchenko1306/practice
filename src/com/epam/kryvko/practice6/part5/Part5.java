package  com.epam.kryvko.practice6.part5;

import com.epam.kryvko.practice6.part3.Type;
import com.epam.kryvko.practice6.part3.TypeFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Part5 {

	private static final String BASE_NAME = "resources";

	private static  final  String ENCODING = "UTF-8";

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in ,ENCODING));
		do
		{
			String[] values = reader.readLine().split(" ");
			ResourceBundle bundle = ResourceBundle.getBundle("resources" , new Locale(values[1]));
			System.out.println(bundle.getString(values[0]));
		}while(!reader.readLine().equals("stop"));



	}

}