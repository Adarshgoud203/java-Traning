//printing month by switch case 
import java.util.Scanner;
class InputMonthNumberIf{
public static void main(String args[]){
Scanner scob=new Scanner(System.in);
int dn;
dn=scob.nextInt();
if(dn==1){
System.out.println("january");}
else if(dn==2){
System.out.println("febuary");}
else if(dn==3){
System.out.println("march");}
else if(dn==4){
System.out.println("april");}
else if(dn==5){
System.out.println("may");}
else if(dn==6){
System.out.println("june");}
else if(dn==7){
System.out.println("july");}
else if(dn==8){
System.out.println("august");}
else if(dn==9){
System.out.println("september");}
else if(dn==10){
System.out.println("october");}
else if(dn==11){
System.out.println("november");}
else if(dn==12){
System.out.println("december");}
else {System.out.println("INVALID");
}
}
}