// Author:Daniel Boktor + FLVS AP CSA Team.
// made on 12/30/22
// The purpose of this program is to do various tasks with a given number using a method. 



import java.lang.Math;
import java.math.BigInteger;
public class MathTrickv2{
	/**
	 * 
	 ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again
	public static int getRandomNum() 
	{	int num = 0;
		num = (int)(Math.random() * 899 )+ 100; 
		return num;
	}


	public static int reverseDigits (int num) {
		int onesDigit;
		int hundredsDigit;
		int reversedNum;

		onesDigit = num%10;
		hundredsDigit = (num/100);  
	
		reversedNum = ((num-(hundredsDigit*100)-onesDigit) + (onesDigit*100)+hundredsDigit);
		return reversedNum; 
	}
	
	
	public static int OriginalMinusReverse(int num, int reversedNum){
		int originalMinusReverse;
		if (num>reversedNum){
			originalMinusReverse=  (num-reversedNum);
		}
		else{
			originalMinusReverse = reversedNum - num;
		}
		return originalMinusReverse; 
	}

	public static Integer origRevPlusRevOfRev(int num){
		int reverseSquared = 0;
		int onesDigit;
		int hundredsDigit;

		onesDigit = num%10;
		hundredsDigit = (num/100);
		reverseSquared = ((num-(hundredsDigit*100) - onesDigit) + hundredsDigit + (onesDigit*100));
		reverseSquared += num;
		return ((reverseSquared));
	}

	public static BigInteger TimesOneMillion(int num){
		BigInteger timesOneMillion = BigInteger.valueOf(num* 1000000);
		
		return timesOneMillion;
	}


	
	public static BigInteger SubtractFromMillion(BigInteger num){
		BigInteger subtraction =new  BigInteger("733361573"); 
		BigInteger subtractFromMillion = num.subtract(subtraction);
		return subtractFromMillion;
	}


	public static String strConvert(BigInteger  num){
		String strConvert = String.valueOf(num);
		return strConvert;
	} 


	public static String replaceLtr(String str){
		String replacedLtrs = "";
		String[] replacedLetters = str.split("");
		for (int i = 0 ; i < replacedLetters.length; i++){
			if(replacedLetters[i].equals("0")){
				replacedLetters[i] = "Y";
			}
			if(replacedLetters[i].equals("1")){
				replacedLetters[i] = "M";
			}
			if(replacedLetters[i].equals("2")){
				replacedLetters[i] = "P";
			}
			if(replacedLetters[i].equals("3")){
				replacedLetters[i] = "L";
			}
			if(replacedLetters[i].equals("4")){
				replacedLetters[i] = "R";
			}
			if(replacedLetters[i].equals("5")){
				replacedLetters[i] = "O";
			}
			if(replacedLetters[i].equals("6")){
				replacedLetters[i] = "F";
			}
			if(replacedLetters[i].equals("7")){
				replacedLetters[i] = "A";
			}
			if(replacedLetters[i].equals("8")){
				replacedLetters[i] = "I";
			}
			if(replacedLetters[i].equals("9")){
				replacedLetters[i] = "B";
			}
			replacedLtrs += replacedLetters[i];
		}
		return replacedLtrs; 
	}


	public static String reverseString(String str){
		char[] flipArray = str.toCharArray();
		String flippedString = "";
		for (int i =(str.length() - 1); i>0 ; i--){
			flippedString += flipArray[i];	
		}
		return flippedString;
	}


	public static void main(String[] args) 
	{
		int num = getRandomNum();
		int reversedNum = reverseDigits(num);
		int OminusR = OriginalMinusReverse(num, reversedNum);
		int reverseSquared = origRevPlusRevOfRev(OminusR);
		BigInteger timesOneMillion =TimesOneMillion(reverseSquared);
		BigInteger subtractFromMillion = SubtractFromMillion(timesOneMillion);
		String strConvert = strConvert(subtractFromMillion);
		String replacedLtrs= replaceLtr(strConvert);
		String reversedString = reverseString(replacedLtrs);

		System.out.println("The starting number is: " + num);
		System.out.println("The reversed number is: " + reversedNum);
		System.out.println("The difference is: " + OminusR);
		System.out.println("The reversed number added to the difference: " + reverseSquared);
		System.out.println("Number x one million: " + timesOneMillion);
		System.out.println("Number minus 733361573" + subtractFromMillion);
		System.out.println("Number converted to string: " + replacedLtrs);
		System.out.println("Reversed String: " + reversedString);
			} // end main
} // end class