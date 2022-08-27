import java.util.Scanner;

class Main(){
public static void main(){
int n,sum;
System.out.println("Enter the value of n: ");
Scanner input = new Scanner(System.in);
n = input.nextInt();
sum = n(n+1);
System.out.println("The sum of 1 to n numbers is : "+ sum);
}
}