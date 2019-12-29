package com.string.sinha;

import java.util.Arrays;

class TestAnagram{
	String s1,s2;
	TestAnagram(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	boolean checkAnagram() {
		boolean result = false;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(s1.length()==s2.length()) {
			 result = Arrays.equals(c1, c2);
		}else {
			System.out.println("Not a Pangram!");
		}
		
		return result;
		
	}
}
public class Anagram {

	
	public static void main(String[] args) {
		TestAnagram  t = new TestAnagram("Hello", "olleh");
		System.out.println("Is this Pangram: "+t.checkAnagram());
	}

}
