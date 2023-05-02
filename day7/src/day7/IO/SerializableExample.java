package day7.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("Varun");
		System.out.println(e);
//		Serializing am object in JAVA

		File file = new File("C:\\Users\\VASHRIT\\Desktop\\Upload-git\\serializable.txt");
		try (FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);) 
		{
			oos.writeObject(e);
//			De-serialize or to read back
			Employee emp;
			emp = (Employee) ois.readObject();
			System.out.println("De-Serialized-----" + emp);

		} catch (FileNotFoundException e1) {
			System.out.println(e1.getClass() + "############" + e1.getMessage());
		} catch (IOException e2) {
			System.out.println(e2.getClass() + "------------" + e2.getMessage());
		} catch (ClassNotFoundException e3) {
			System.out.println(e3.getClass() + "@@@@@@@@@@@@" + e3.getMessage());
		}

	}

}
