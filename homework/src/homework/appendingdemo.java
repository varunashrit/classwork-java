package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class appendingdemo {
	public static void main(String []args) {
		try {
			String data ="Trying something new";
			File file = new File("C:\\Users\\VASHRIT\\Desktop\\"
					+ "Upload-git\\Home work\\appending.txt");
			if(!file.exists()) {
				boolean flag = file.createNewFile();
				if(flag) {
					System.out.println("new file created");
				}
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter buffWriter= new BufferedWriter(fw);
			buffWriter.write("Dude Sleep");
			buffWriter.append(data);
			buffWriter.close();
			
			FileReader fr = new FileReader("C:\\Users\\VASHRIT\\Desktop\\"
					+ "Upload-git\\Home work\\appending.txt");
			BufferedReader buffReader = new BufferedReader(fr);
			buffReader.read();
			System.out.println(buffReader.readLine());
			buffReader.close();
			
		}catch (FileNotFoundException e) {
			System.out.println("FIle not found");
		}catch (IOException e) {
			System.out.println("IO Exception:((");
		}
	}

}
