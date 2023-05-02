package day7.IO;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[]args) {
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\writer.txt");
			fw.write("Hello BRo good Morning");
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\writer.txt");
			int i = 0;
			while((i = fr.read())!=-1) {
				System.out.println((char)i);
			}
			fr.close();
		}catch (FileNotFoundException e) {
			System.out.println("File does not exist");
			
		}catch (IOException e) {
			System.out.println("Not a valid command"+e);
		}
	}

}
