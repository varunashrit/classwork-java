package day7.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Appendinf1 {
	public static void main(String []args) {
		try {
			String data = "I am slowly dying";
			File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\append1.txt");
			if(!file.exists()) {
				boolean flag = file.createNewFile();
				if(flag) {
					System.out.println("New File Created");
				}
			}
			FileWriter fw = new FileWriter(file, true);
			
			BufferedWriter buffWriter = new BufferedWriter(fw);
			buffWriter.write(data);
			buffWriter.append("I am dead");
			
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

