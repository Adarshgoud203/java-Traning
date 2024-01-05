//sum and average of an array element
class Main {
public static void main(String args[]){
int[] numbers={2,-5,6,8,-10,5,7,-8,-7};
int sum=0;
Double average;
//access all elements using for each loop & add each element in sum
for(int number: numbers){
sum += number;
}
//get the total number of element
int arrayLength = numbers.length;
//calculate the average ,convert the average frony int to double
average =((double)sum/(double)arrayLength);
System.out.println("Sum ="+sum);
System.out.println("Average ="+average);
}
}


