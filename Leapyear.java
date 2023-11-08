import java.util.Scanner;

public class Leapyear {
    public static void main(String args[]){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
         year = sc.nextInt();

         if(year % 400 ==0){
            System.out.println("Year is leap");
         }
         else if(year % 4 ==0){
            System.out.println("year is leap");
         }
         else if(year % 100 !=0){
            System.out.println("Year is not leap");
         }
         else{
            System.out.println("This is a common Year");
         }
    }
}
