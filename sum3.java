// write a program that gets three numbers from the keyboard and display the sum of the numbers.
// -Determine the specification 
  //input: num1, num2, num3
 //process: result= num1 + num2 + num3
  //output: result

//Design 
  //Introduce the program 
  //ask user for inputs
  //wait for user inputs and store variable
  //calculate
  //display result
import java.util.Scanner;
public class sum3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.println("Welcome");
		 System.out.println("Enter three intvalues");
		 int num1 = input.nextInt();
		 int num2 = input.nextInt();
		 int num3 = input.nextInt();
		 int result= num1 + num2 + num3;
		 System.out.println("Result is"+result);
	}

 


}
