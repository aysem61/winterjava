package day21_Kubra;

public  class AccessModifiers01 extends Q01_ForEach {
	
	
	private static String privateString = "private String";
	protected String protectedString = "protected String";
	String defaultString = "default String";
	public static  String publicString = "public String";

	public void publicMethod() {
		System.out.println("This is public method");
	}

	protected void protectedMethod() {
		System.out.println("This is protected method");
	}

	void defaultMethod() {
		System.out.println("This is default method");
	}

	private void privateMethod() {
		System.out.println("This is private method");
	}

}
