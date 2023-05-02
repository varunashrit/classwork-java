package day7.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferreaderWriterEx {
	public static void main(String[]args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\buffer.txt");
			BufferedWriter buffWriter = new BufferedWriter(fw);
			buffWriter.write("Java is the best pgm language\t");
			buffWriter.append("I am appending this shit");
			buffWriter.close();
			
			FileReader fr = new FileReader("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\buffer.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
