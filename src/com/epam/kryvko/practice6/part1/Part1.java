package com.epam.kryvko.practice6.part1;


import com.epam.kryvko.practice6.Converter;

import java.io.*;

public class Part1 {

	private static final String FILE_NAME = "data2.txt";

	private static final String ENCODING = "UTF-8";


	private  static  final  String FILE_NOT_FOUND_MSG = "Файл не найден";

	private  static  final  String IO_ERROR_MSG   = "i/o error";

	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(FILE_NAME) , ENCODING)))
		{
			Converter converter = new ConverterPart1();
			for(String line = null; (line = reader.readLine()) != null;)
			{
				System.out.println(converter.convert(line));
			}

		} catch (FileNotFoundException e)
		{
			System.out.println(FILE_NOT_FOUND_MSG);
		}
		catch (IOException e)
		{
			System.out.println(IO_ERROR_MSG);
		}
	}

}