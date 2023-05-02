package day5.string;

public class stringNewOperation {
	public static void main(String[] args) {
	String str= "core";
	String s = "core";
	String s2= new String("core");
	
	System.out.println(s2.hashCode());
	System.out.println(s.hashCode());
	System.out.println(str.hashCode());
	
	s="hi";
	System.out.println("s---"+s.hashCode());
	
	String s1 = s.replace('i','a');
	System.out.println(s1);
	
}}
