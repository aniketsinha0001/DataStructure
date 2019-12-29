package com.string.sinha;

class TestSubset{
	String s;
	TestSubset(String s){
		this.s=s;
	}
	
	public void allSubSet() {
		int n=s.length();
		String str="";
		int a[]=new int[n*(n+1)/2];
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				str=s.substring(i, j+1);
				System.out.println(str);
			}
		}
		
	}
	
}

public class AllsubsetString {

	public static void main(String[] args) {

		TestSubset t = new TestSubset("welcome");
		t.allSubSet();
	}

}
