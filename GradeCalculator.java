import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of English Subject:");
        float num1 = sc.nextFloat();
        System.out.print("Enter the marks of Maths Subject:");
        float num2 = sc.nextFloat();
        System.out.print("Enter the marks of Science Subject:");
        float num3 = sc.nextFloat();
        System.out.print("Enter the marks of SST Subject:");
        float num4 = sc.nextFloat();
        System.out.print("Enter the marks of Hindi Subject:");
        float num5 = sc.nextFloat();
        float sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Total Marks obtained in all the five subjects is:" + sum);
        float avgpercent = (sum / 5);
        System.out.println("Average Percentage Obtained in all the five subject is:" + avgpercent);
        if (avgpercent >= 90) {
            System.out.println("Grade Obtained:A Grade");
        }
        if (avgpercent >= 80 && avgpercent < 90) {
            System.out.println("Grade Obtained:B Grade");
        }
        if (avgpercent >= 70 && avgpercent < 80) {
            System.out.println("Grade Obtained:C Grade");
        }
        if (avgpercent >= 60 && avgpercent < 70) {
            System.out.println("Grade Obtained:D Grade");
        }
        if (avgpercent >= 50 && avgpercent < 60) {
            System.out.println("Grade Obtained:E Grade");
        }
        if (avgpercent < 50) {
            System.out.println("Grade Obtained:FAIL!!!");
        }
        sc.close();
    }
}
