package com.string.sinha;

class VowelsTest{
	String s;
	int count,cc;
	VowelsTest(String s){
		this.s=s;
		s=s.toLowerCase();
		count = 0;
		cc=0;  
	}
	int checkCount() {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {				
				count++;
				}
			else if(s.charAt(i) >'a' && s.charAt(i) <= 'z') {
				
				cc++;			
			}
		}
		System.out.println("Consonents are "+cc);
	
		return count;
		
	}
}

public class CountVowels {

	public static void main(String[] args) {
		VowelsTest v=new VowelsTest("This is a really simple sentence");
		System.out.println("Vowels are "+v.checkCount());

	}

}
