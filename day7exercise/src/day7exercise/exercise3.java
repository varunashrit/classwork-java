package day7exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> country = new HashMap<>();
		File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\Country.txt");
		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
			String data;
			while ((data = br.readLine()) != null) {
				String arr[] = data.split("=");
				country.put(arr[0], arr[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(country);

		//3. method to store in csv format

		writeToFile("Countries_s.csv", 'I');
	}

	public static void writeToFile(String newFilename, char countryNameBeginningWith) {
		File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\Country.txt");
		File wfile = new File(
				"C:\\Users\\VASHRIT\\Desktop\\Upload-git" + newFilename);
		try (FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(wfile, true);
				BufferedWriter bw = new BufferedWriter(fw);)

		{
			if (!wfile.exists()) {
				wfile.createNewFile();
			}
			String str;
			while ((str = br.readLine()) != null) {
				String s[] = str.split("=");
				if (s[0].toUpperCase().charAt(0) == countryNameBeginningWith) {
					bw.append(str);
					bw.newLine();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
