package Midterm;

import java.util.Scanner;

public class Test1 {
private static final int x = 2561;
public static void main (String[] args){
    int i = 1;
    for (; i <= 3; ) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("กรุณากรอกข้อมูลปี พ.ศ. เกิดของคุณ");
        int y = Scanner.nextInt();
        System.out.println("อายุของคุณคือ " + (x - y));
        i++;
    }
}//main


}//class

