package day02scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * byte<short<int<long<float<double
		 * 
		 * small - large =can be done by Java
		 * 
		 */
		// Auto Widening:If you assign a small data to a large data type,type casting
		// is done automatically by java.
		// This process is called "Auto Widening"

		byte b1 = 112;

		int i1 = b1;

		System.out.println(b1);

		System.out.println(i1);

		// Explicit Narrowing:If you assign a large data type to a small data type'
		// type casting cannot be done by Java automaticially.
		// You should take the responsibility and take the casting explicity.
		// This process is called "Explicit Narrowing"
		int i2 = 120;
		short s1 = (short) i2;

		System.out.println(i2);

		System.out.println(s1);

		// * byte<short<int<long<float<double

		// When you type "float f1=2.3;" ,it will complain.
		// To fix tahat issue, you have 4 options
		// 1. way

		float f1 = 2.3F;

		float f2 = 2.3f;

		float f3 = (float) 2.3;

		double f4 = 2.3;

		// If you use "Explicit Narrowing" with the numbers which are not in the
		// interval
		// then you will get diffrent results.the results will be calculated according
		// to the
		// modulus operation.
		short s2 = 200;

		byte b4 = (byte) s2;

		System.out.println(s2); // 255
		System.out.println(b4);// -1

		int i3 = 5;
		int i4 = 2;
		// The result will be 2 bacause int/int=int for Java
		System.out.println(i3 / i4);

	}

}
