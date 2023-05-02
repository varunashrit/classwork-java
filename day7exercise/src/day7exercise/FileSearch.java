package day7exercise;

import java.io.File;
import java.util.Scanner;

public class FileSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dir;
		dir=args[0];
		String ext=args[1];
		File f=new File(dir);
		if(!f.isDirectory()||f.isFile()||!f.exists()) {
			System.out.println("Path given is invalid");
		}
		else {
			String list[]=f.list();
			for(String files:list) {
				if(files.contains(ext))
					System.out.println(files);
			}
		}

	}

}
