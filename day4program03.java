//code for arthemetic operator
import java.util.Scanner;
class ArithmeticOperator{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("Enter the first number:");
double num1=ob.nextDouble();
System.out.println("Enter the second number:");
double num2=ob.nextDouble();
double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double division=num1/num2;
double quotient=num1%num2;
System.out.println("the sum of two numbers  is:"+sum);
System.out.println("the difference of two numbers is:"+difference);
System.out.println("the division of two numbers is:"+division);
System.out.println("the product of two numbers is:"+product);
System.out.println("the quotient of two numbers is:"+quotient);
}
}