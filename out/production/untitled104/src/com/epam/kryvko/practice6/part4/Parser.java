package  com.epam.kryvko.practice6.part4;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser implements Iterable<String> {


	Matcher matcher;

	public Parser(String fileName, String encoding) throws IOException {
		// TODO place your code here
		String data =  new String(Files.readAllBytes(Paths.get(fileName)) ,encoding);
		Pattern pattern = Pattern.compile("(?<=(\\.|^))((.|(?:\\s))+?)(?=\\.)");
		this.matcher  = pattern.matcher(data);

	}

	@Override
	public Iterator<String> iterator()
	{
		return new Iterator<String>(){

			private int current = 0;

			@SuppressWarnings("unchecked")
			public boolean hasNext()
			{
				return  matcher.find();
			}

			@Override
			@SuppressWarnings("unchecked")
			public String next() {
				if(!matcher.find(current)) throw new IllegalStateException();
				String res = matcher.group();
				current+= res.length();
				return res.trim();
			}
		};
	}


}