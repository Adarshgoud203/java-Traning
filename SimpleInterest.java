/*simple interest*/
import java.util.Scanner;
class SI 
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int P=sc.nextInt();
double r=sc.nextInt();
double t=sc.nextInt();
double si=P*r*t/100;
System.out.println(si);
}}