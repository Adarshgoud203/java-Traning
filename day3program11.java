//java Program to demonstrate Narrow type casting
import java.io.*;
class Test{
public static void main(String args[])
{
double i=100.245;
//Narrow Type Casting
Short j=(short)i;
int k=(int)i;
System.out.println("Original value before CAsting"+i);
System.out.println("After Type Casting to Short"+j);
System.out.println("After Type Casting to int"+k);
}
}