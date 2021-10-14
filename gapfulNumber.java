import java.util.Scanner;

public class gapfulNumber {

	public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("Place Enter any number:");
         int number = scn.nextInt();
         if(gapfulNumber(firstNumber(number), lastNumber(number), number)) 
            System.out.print("Gapful Number");
         else 
            System.out.print("Is not Gapful Number"); 
	
	
	public static int firstNumber(int number) {
	   int digit = (int)  Math.log10(number);
           return (int) (number / Math.pow(10, number));
	}
	
	public static int lastNumber(int number) {
	  String stringNumber = String.valueOf(number);
          return (int) stringNumber.charAt(stringNumber.length() - 1);
	}
	
	public static boolean gapfulNumber(int firstNumber,int lastNumber,int number) {
	  int concatNumber = firstNumber * 10 + lastNumber;
	  return (number % concatNumber == 0) ? true : false;	
       }	
    }

}
