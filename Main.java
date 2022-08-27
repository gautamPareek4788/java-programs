import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    float totalClasses,attendedClasses,percentage;
    System.out.println("Enter total classes held: ");
    Scanner input = new Scanner(System.in);
    totalClasses = input.nextFloat();
    System.out.println("Enter classes attended: ");
    attendedClasses = input.nextFloat();
    percentage = (attendedClasses/totalClasses)*100;
    System.out.println("Percentage of Classes attended is: "+percentage);
    if(percentage<75){
      System.out.println("You are not allowed to sit in examination..");
    }
    else{
      System.out.println("You are allowed to sit in exams...");
    }
  }
}