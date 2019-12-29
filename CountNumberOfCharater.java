package com.string.sinha;

class TestString{
	String s;

	int countChar(String s) {
		this.s=s;
		int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!= ' ') {    
			count++;
			}
		}		
	return count;		
	}
}

public class CountNumberOfCharater {

	public static void main(String[] args) {
		TestString t=new TestString();
		
		System.out.println(t.countChar("hello world"));

	}

}
