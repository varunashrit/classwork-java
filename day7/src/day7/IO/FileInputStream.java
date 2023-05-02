package day7.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\v.txt");

		try {
//			Reading 1 by 1 characters

			java.io.FileInputStream fil = new java.io.FileInputStream(file);
			System.out.println((fil.read()));
			int i = fil.read();
			System.out.println(i);
//			logger.log(i);
			System.out.println((char) i);
			System.out.println("#$%#$#%#$#%#$#%#$#%#$#%#$#%#$#%");

//			If you want to read all characters
//			int f=0;
//			while ((f=fil.read())!=-1) {
//				System.out.println((char)f);
//			}
//			Using read all Bytes
			byte arr[] = fil.readAllBytes();
			int f = 0;
			while (f < arr.length) {
				System.out.println((char) arr[f]);
				f++;
			}
			fil.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
