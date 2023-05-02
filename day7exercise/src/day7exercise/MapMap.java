package day7exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
public class MapMap {
	public static void main(String[] args) {
		HashMap <String, String> mp = new HashMap<>();
		File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\map.txt");
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		{
		String line;
		while((line = br.readLine()) != null) {
		String[] strArr = line.split("=");
		String s1 =strArr[0];
		String s2= strArr[1];
		mp.put(s1,s2);
		}
		System.out.println(mp);}}
		catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
	}