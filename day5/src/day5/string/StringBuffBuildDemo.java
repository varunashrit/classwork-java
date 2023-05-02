package day5.string;

public class StringBuffBuildDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("abc");
		
		System.out.println(sb1.hashCode());
		sb1.append("def");
		System.out.println(sb1);
		System.out.println(sb1.hashCode());
		
		System.out.println("**************");
		
		String s = "var";
//		s.concat("un");
		s=s.concat("un");
		System.out.println(s);
		System.out.println(s.hashCode());
		
		System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
		
		StringBuffer sb2 = new StringBuffer("klm");
		sb2.append("jj");
		System.out.println(sb2);
		
		System.out.println("###########################");
		
		StringBuilder sbl = new StringBuilder("ash");
		sbl.append("rit").reverse().insert(3, "===");
		System.out.println(sbl);
		

	}

}
