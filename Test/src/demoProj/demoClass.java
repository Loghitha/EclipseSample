package demoProj;

import java.util.Scanner;

public class demoClass implements demoInterface {

	@Override
	public Integer add(Integer x, Integer y) {
		return x + y;
	}

	@Override
	public Integer sub(Integer x, Integer y) {
		return x - y;
	}

	@Override
	public Integer mul(Integer x, Integer y) {
		return x * y;
	}

	@Override
	public Integer div(Integer x, Integer y) throws ArithmeticException {
		return x / y;
	}

	public static void main(String a[]){
		Integer val1,val2;
		demoInterface obj = new demoClass();
		Scanner s = new Scanner(System.in);
		
		System.out.println("CALCULATOR PROGRAM");
		
		System.out.println("Enter first number:");
		val1 = s.nextInt();
		
		System.out.println("Enter second number:");
		val2 = s.nextInt();
		
		Integer choice;
		System.out.println("Enter your choice:1.Addition 2.Subtraction 3.Multiplication 4.Division");
		choice = s.nextInt();
		
		switch(choice){
		case 1: System.out.println("Result:"+obj.add(val1, val2));
		        break;
		case 2: System.out.println("Result:"+obj.sub(val1, val2));
                break;
		case 3: System.out.println("Result:"+obj.mul(val1, val2));
                break;
		case 4: try{
			    System.out.println("Result:"+obj.div(val1, val2));
                 break;
		}catch(ArithmeticException e){
			System.out.println("Exception:"+e);
		}
			
		}
	}
}
