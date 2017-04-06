public class FibonacciCalculator {
public static void main(String args[]) { 

System.out.println("Enter number upto which Fibonacci series to print: "); 
int number = new Scanner(System.in).nextInt(); 
System.out.println("Fibonacci series upto " + number +" numbers : "); 
 for(int i=1; i<=number; i++){
 System.out.print(fibonacci2(i) +" "); 
 }
 
 } 
