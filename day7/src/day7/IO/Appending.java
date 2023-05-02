package day7.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Appending {

	public static void main(String[] args) {
		try {
			String data = "I am slowly dying";
			File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\append.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter buffWriter = new BufferedWriter(fw);
			buffWriter.write(data);
			
			FileReader fr = new FileReader("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\append.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			
			br.close();
			buffWriter.close();
			
		}catch (IOException e) {
			System.out.println("IOException :(");
		}

	}

}
