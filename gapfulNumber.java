import java.util.Scanner;

public class gapfulNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Place enter any number:");
		int number=scn.nextInt();
		if(numberOfDigit(number))
		    System.out.println("Gapful number");
		else
		    System.out.println("Is not Gapful number");		
	}
	public  static boolean numberOfDigit(int number) {
		int count=0, firstNumber = 0,lastNumber=0,orjNumber=number;
		do {
			int temp=number%10;
			number/=10;
			count++;
			if(count==1) {
				lastNumber=temp;
			}
			else if(count==3) {
				firstNumber=temp;
			}
		}while(number!=0);
		if(gapfulNumber(firstNumber, lastNumber, orjNumber))
		    return true;
		else
		   return false;
		
	}	
public static boolean gapfulNumber(int firstNumber,int lastNumber,int number) {
	int value=firstNumber* 10 + lastNumber;
	 if(number % value==0)
		 return true;
	 
		 return false;
}
}
