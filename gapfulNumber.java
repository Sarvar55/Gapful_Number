import java.util.Scanner;

public class GapfulNumber {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner scn = new Scanner(System.in);
         System.out.print("Please Enter any number: ");
         int number = scn.nextInt();
         
         
         if(gapfulNumber(firstNumber(number), lastNumber(number), number)) 
            System.out.print("Gapful Number");
         else 
            System.out.print("It is not a Gapful Number"); 
	}
	
	public static int firstNumber(int number) {
		int digits = (int)(Math.log(number) / Math.log(10));
                return (int)(number / Math.pow(10, digits));
	}
	
	public static int lastNumber(int number) {
		return number % 10;
	}
	
	public static boolean gapfulNumber(int firstNumber,int lastNumber,int number) {
		int concatNumber = firstNumber * 10 + lastNumber;
		return (number % concatNumber == 0) ? true : false;	
	}

}
