package org.type;

public class TypesOfVariables {
	
	//Static variable
	public static int c;
	
	//Instance Variable
	 int b;

	private void cmpId() {
		//Local Variable
		int a = 0;
		System.out.println("Cmp Id is : 626");
		System.out.println("Local varaiable cmp id: " + a);
		b=200;
		c=2000;
		
	}

	private void cmpName() {
		int a = 20;
		System.out.println("Local varaiable cmp name: " + a);
		b=300;
		c=3000;

	}

	public static void main(String... args) {
		TypesOfVariables ty = new TypesOfVariables();
		System.out.println("Static Variable: "+c);
	
		System.out.println("Before cmpId instance variable: "+ty.b);
		
		ty.cmpId();
		System.out.println("Static variable after cmp id: "+c);
		System.out.println("After cmpId *Instance* variable: "+ty.b);
		
		
		System.out.println("=========================================");
		ty.cmpName();
		System.out.println("Static variable after cmp name: "+c);
		System.out.println("After cmpName *Instance* variable: "+ty.b);
		
		System.out.println("*******************************************");
		
		TypesOfVariables y = new TypesOfVariables();
		System.out.println("Static variable after new object: "+c);
		System.out.println("After new Object: "+y.b);
		y.cmpId();
		System.out.println("After new Object cmpId is: "+y.b);
		y.cmpName();
		System.out.println(y.b);
		
		
		
		
		
		
		
		

}
}