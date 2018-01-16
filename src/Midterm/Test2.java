package Midterm;

import java.util.Scanner;

public class Test2 {
static Scanner Scanner = new Scanner(System.in);
public static void main (String[] args){
    String id = getID();
    String name = getName();
    String Salary = getSalary();
    String OverTime = getOverTime();
    String calculateTax = calculateTax();
    String showDataInfo = showDataInfo();
}

    public static String getID() {
        System.out.print("Enter employee id: ");
        return Scanner.nextLine();
    }
    public static String getName() {
        System.out.print("Enter employee name: ");
        return Scanner.nextLine();
    }
    public static String getSalary() {
        System.out.print("Enter employee Salary: ");
        return Scanner.nextLine();
    }
    public static String getOverTime() {
        System.out.print("Enter employee OverTime: ");
        return Scanner.nextLine();

    }
    public static String calculateTax() {
        System.out.print("Enter employee calculateTax: ");
        return Scanner.nextLine();

    }
    public static String showDataInfo() {
        System.out.print("Enter employee showDataInfo: ");
        return Scanner.nextLine();
    }
}//class













