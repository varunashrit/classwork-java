package day7.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {
	public static void main(String[]args) {
//		Random access will store large array of file. 
//		It has file pointer used for position of the cursor to move
		String filePath = "C:\\Users\\VASHRIT\\Desktop\\Upload-git\\rand.txt";
		String data = "Mav aram adi";
		int position = 5;
		int size = 10;
		
		// writeToAFile
		writeToAFile(filePath, data, position);
		// readFromAFile
		readFromAFile(filePath, position, size);
		}
	private static void readFromAFile(String filePath, int position, int size) {

		try {
			File file =new File(filePath);
			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
			randomAccessFile.seek(8);
			byte[] bytes = new byte[size];
			randomAccessFile.read(bytes);
			System.out.println(new String(bytes));
			randomAccessFile.close();

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	private static void writeToAFile(String filePath, String data, int position) {
		try {
			File file = new File(filePath);
			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
			randomAccessFile.seek(position);//seek the cursor position
			randomAccessFile.write(data.getBytes());
			randomAccessFile.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
