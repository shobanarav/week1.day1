package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int orgNumber = 123;
        int number = orgNumber;
        int calc=0;
        int cube = 0;
        
        while(number!=0)
        {
        	int remainder = number%10;
        	cube=remainder*remainder*remainder;
        	calc= calc+cube;
        	number= number/10;
        }
        
        if(orgNumber==calc)
        {
        	System.out.println("The number is an Armstrong number");
        }
        else
        {
        	System.out.println("The number is not an Armstrong Number");
        }
	}

}
