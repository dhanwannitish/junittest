package jUnitTestPackage;
import java.util.*;
public class jUnitFunctions {
	int addition(int a, int b) {
		return(a+b);
	}
	String addi(String str1, String str2) {
		return(str1+str2);
	}
	public static void main(String args[]) {
		jUnitFunctions ob=new jUnitFunctions();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter two numbers for their addition.");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int sum=ob.addition(a, b);
		System.out.println("Enter two Strings to Concatenate them.");
		String str1=Sc.next();
		String str2=Sc.next();
		String str=ob.addi(str1, str2);
		System.out.println("The sum of the entered numbers is:"+sum);
		System.out.println("The concatenated Strings are as follows:"+str);
	}
}
