package week1.day1;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 8;
		boolean isPrime= true;
	for(int a=2; a>=num; a++) {
		
		int b = num%a;
		if(b==0) {
			isPrime= false;
			break;
		}
	}
	
	if(!isPrime)
	{
		System.out.println("The number is not Prime");
	}
	else {
		System.out.println("The number is Prime");
	}
		
	}

}
