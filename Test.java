package com.fs.test;

public class Test {
	
	public void Method(int a,int b){
		if (a==b){
			System.out.println("a==b");
		}
		boolean value = a != b ;
		System.out.println(value);//a=b:false;a!=b:true
			
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.Method(3, 4);

	}

}
