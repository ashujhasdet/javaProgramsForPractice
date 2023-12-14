package logicalPrograms;
import java.util.Scanner;
/*
A java program to find the first and last digit of a given number. 
We will take number as input from user at run time.
*/
public class FirstAndLastDigit {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		//For taking input from user at run time we need an object of Scanner class
		Scanner sc = new Scanner(System.in);
		//exit variable for while loop, so that we can ask user to run program again and again
		boolean exit = true;
		while(exit) {
		System.out.println("\nEnter your choice\n1.Find First and Last Digit of A Number\n2.Exit\n");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: {  System.out.println("Enter a positive integer number\n");
		           int num = sc.nextInt();
		           digit(num);//method to find the digits
		
		           }break;
		           
		case 2: { exit = false;
		          System.out.println("Thank You\n Exit Success\n");
			     }break;
			     
		default:{System.out.println("Please Enter a Valid Input\n");}	     
		
		}
		}
		System.out.println("Main Ends");
		
	}
	
	//method to find first and last digit of a number
	public static void digit(int num) {
		//Logic
		int temp=num;//to store original number before doing any operation
		 // If Number is a single digit number
		  if(num>=0 && num<10){
			System.out.println("Last Digit of "+ temp  + "  is "+temp);
			System.out.println("First Digit of "+ temp  + "  is "+temp);
		  }
		  //otherwise 
		/* 
		 For last digit :  num%10 will give last digit
		 For first digit :  run a loop and keep dividing by 10 means num/10, until quotient =0;
		                    we will get first digit of number
		 */
		  else{
		  int lastDigit=0;
		  int firstDigit=0;
		  lastDigit=num%10;//example 234-->234%10=4
		  while(num!=0) {
			  firstDigit=num%10;//234%10=4-->23%10=3-->2%10=2
			  num=num/10;//234/10=23/10=2
		  }
		  
		  System.out.println("First Digit of "+ temp +"is "+firstDigit);
		  System.out.println("Last Digit of "+ temp +"is "+lastDigit);
		
	}  
		  }

}
