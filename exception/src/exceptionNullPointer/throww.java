package exceptionNullPointer;

import java.io.FileNotFoundException;

public class throww {
	void proc() throws FileNotFoundException {
		try {
			throw new FileNotFoundException("From Exception");
		}catch(FileNotFoundException e) {
			System.out.println("caught inside demo ");
			throw e;
		}
	}
	public static void main (String args[]) {
		throww t = new throww();
		try {
			t.proc();
		}catch(FileNotFoundException e) {
			System.out.println("Recaught: "+e);
		}
	}
}
