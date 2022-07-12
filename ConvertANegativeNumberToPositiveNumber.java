
public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number =-52;
		
		if(number <0)
		{
			number = Math.abs(number);
			System.out.println("the converted number is "+number);
		}
		else
		{
			System.out.println("the number is " +number);
		}

	}

}
