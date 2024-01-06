import java.util.Scanner;

class Program30 
{   //A java Program to check a number is Armstong number or not?
	/* 
	It is a positive n-digit number in which sum of power of each digit to the power of n is equal to the original n-digit number.
	means, 
	1 is a 1-digit number ==> 1^1=1==>Armstrong number
	2 is also a 1-digit number so ==>2^1=2==>Armstrong number
	123 is 3-digit number ==>1^3+2^3+3^3=1+8+27=36 not same as original number so Not ArmStrong number

	
	*/
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check ");
		int num=sc.nextInt(); 
		if(isArmStrong(num)){
			System.out.println(num+" Is an ArmStrong Number");
		}
		else
		System.out.println("Not An ArmStrong Number");
	}



    public static boolean isArmStrong(int num){
	    
			
			//let number of digit = count 
			int count =0;
			int sum =0;
			int temp =num;
			//finding number of digits
			while(temp>0){
				temp=temp/10;
				count++;
			}
			//check the sum

			temp =num;
			while(temp>0){
				int rem =temp%10;
				sum +=  Math.pow(rem,count);
				temp=temp/10;

			}

			if(sum==num){
				return true;
			}
			else {
				return false;
			}



    }


}
