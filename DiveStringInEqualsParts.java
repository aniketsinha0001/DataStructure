package com.string.sinha;

class TestEquals{
	String s;
	TestEquals(String s){
		this.s=s;
		
	}
	int distrubuteEqual() {
		int count = 1;
		for(int i=1; i<s.length();i++) {
			
			if(s.charAt(i-1)==s.charAt(i)) {
				continue;
			}else {
				count++;
			}

		}
		
		return count;		
	}
}

public class DivideStringInEqualsParts {

	public static void main(String[] args) {
		TestEquals t=new TestEquals("aaaabbbbbcccc");
		System.out.println(t.distrubuteEqual());
	}

}
