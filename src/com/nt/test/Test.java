package com.nt.test;
import com.nt.factory.FlipkartFactory;
import com.nt.comp.FlipKart;
public class Test {

	public static void main(String[] args) {
		
		FlipKart f=FlipkartFactory.getInstance("dtdc");
		String res=f.shopping(new String[] {"shirt", "jeans","watch"},new float[] {4000,5000,2000});
		System.out.println(res);

	}

}
