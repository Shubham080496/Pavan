package day33;

public class CaptureText {
public static void main(String[] args) {
		
		String s="Showing 1 to 10 of 14417 (12399 Pages)";
		
		System.out.println(s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1));

	}

}
