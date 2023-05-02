package day5.string;

public class StringOperation {
	public static void main(String[]args) {
		String s = "hello";
		System.out.println("Length hello string==-="+s.length());
		System.out.println("Index of char e in hello is =-=-=-"+s.indexOf('e'));
		System.out.println("Index of char l in hello is =-=-=-"+s.indexOf('l'));
		System.out.println("Index of char l in hello is =-=-=-"+s.lastIndexOf('l'));
		System.out.println("Substring from hello-=-=-"+s.substring(1));
		System.out.println("substring of hello==----="+s.substring(1,3));
		
		String  hi = "Hi    ";
		System.out.println(hi);
		
		System.out.println("Remove whitespaces =-="+hi.trim());
		int num = 12344;
		String numStr = String.valueOf(num);
		System.out.println(numStr);
		System.out.println(numStr instanceof String);
		
//		null pointer exception
//		String emptyString = null;
//		System.out.println(emptyString.isEmpty());
		s= s.concat(" Everyone");
		System.out.println(s);
		System.out.println(s.hashCode());
		String strStrip ="          Hello world      ";
		System.out.println(strStrip.strip());
		System.out.println("==----$##$#$#%%%$%$^%^%^&*");
		System.out.println(strStrip.stripLeading());
		System.out.println(strStrip.stripTrailing());
		strStrip= strStrip.replaceAll("\\s", "");
		System.out.println("removing white spaces"+strStrip);
		System.out.println(strStrip.toLowerCase());
		System.out.println(strStrip.toUpperCase());
		System.out.println(strStrip);
		
		
		String paragraph="Hello Everyone, today is very wonderful sunny day. We are learning String concepts. Here we are learning now about paragraph.";
		System.out.println(paragraph.split("[.]"));
		String[] splittedParagraph = paragraph.split("[.]");
		
		for (String sentence:splittedParagraph) {
			System.out.println(sentence);
		}
	}
	private static void checkStringForEmpty(String emptyString) {
		if(emptyString.equals("")) {
			System.out.println("STring is empty");
		}else {
			System.out.println("String is not empty");
		}
	}
}
