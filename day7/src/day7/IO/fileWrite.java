package day7.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileWrite {
	public static void main(String[]args) {
		try {
			String word ="good morning";
			FileOutputStream fout = new FileOutputStream("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\new.txt");
			fout.write(65);
			fout.write(88);
			
			byte bArr[] = word.getBytes();
			fout.write(bArr);
			
			
			
			fout.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
