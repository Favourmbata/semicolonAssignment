import java.util.Scanner;
   public class SmallestAndLargest {
     public static void main(String[]args) {
     
  Scanner input = new Scanner(System.in);   
  


//  enterring three integer 
 System.out.print("enter first integer:  ");   
   int number1 = input.nextInt();  
     
     
  System.out.print("enter second integer:  ");   
   int number2 = input.nextInt();  
    
 System.out.print("enter third integer:  ");
  int number3 = input.nextInt();

// calculating the sum ,average ,product,smallestand largestnumber


 int sum  = number1 + number2 + number3;

 int average = number1 + number2 + number3 /3;

 int product = number1 * number2 * number3;

// displaying the total sum  

System.out.println("the total sum is "+sum);


 //dislpaying the total average
    System.out.println("the total average is " +average);


// displaying product
System.out.println("the product is "  +product);
 
// displaying the smallest and largest numbers

  int smallest = number1;

  if ( number2 < number1 ){
smallest = number2;
    }
 if (number3 < number2){
smallest = number3;
 }

System.out.println("the smallest number is  " +smallest);

int largest = number1;
  if (number2 > number1){
largest = number2;
}
 if (number3 > number2){
largest = number3;
}

System.out.println("the larget number is" +largest);


  }
 


}
   
   
   
 


  
   





