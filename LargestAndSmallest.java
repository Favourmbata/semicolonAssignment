import java.util.Scanner;
	public class LargestAndSmallest {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("enter first integer");	
	int number1 = input.nextInt();
	
	System.out.print("enter second integer");	
	int number2 = input.nextInt();
	
	System.out.print("enter third integer");
	int number3 = input.nextInt();
	
	System.out.print("enter fourth integer");
	int number4 = input.nextInt();
	
	System.out.print("enter fifth integer");
	int number5 = input.nextInt();
	
	int largest = number5;
	
	if (number4 > number5){
	largest = number4;
	}
	
	if (number3 > number4){
	largest = number3;
	}
	
	if (number2 > number3){
	largest = number2;
	}
	
	if (number2 > number1){
	largest = number1;
	}
	 System.out.println("the largest number is "  +largest);
	
	}	
	
	
	
	
	
	
	
	}



