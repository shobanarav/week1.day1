package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fnum= 0;
		int snum= 1;
		int sum=0;
		System.out.println(fnum);
		System.out.println(snum);
		
		for(int i=1; i<=11; i++) {
			
			sum= fnum + snum;
			fnum=snum;
			snum=sum;
			System.out.println(sum);
			
		}

	}

}
