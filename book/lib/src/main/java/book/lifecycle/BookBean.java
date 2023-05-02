package book.lifecycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookBean {
	private String bookName;

	public BookBean() {
		System.out.println("Constructor of BookBean called !! ");
	}

	@Override
	public String toString() {
		return "BookBean{" + "bookName='" + bookName + '\'' + '}';
	}
	
	public void customDestroy() throws Exception {
		System.out.println("Custom destroy method of BookBean called !! ");
	}

	public void customInit() throws Exception {
		System.out.println("Custom Init method of BookBean called !! ");
	}
}

