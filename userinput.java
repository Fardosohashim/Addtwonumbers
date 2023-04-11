package Addtwonumbers;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        int x,y,sum;
        Scanner myObj=new Scanner(System.in);//creating scanner object
        System.out.println("type a number: ");
        y= myObj.nextInt();//read userinput
        System.out.println("type another number: ");
        x=myObj.nextInt();
        sum=x+y; // calculate the sum of x nd y
        System.out.println("sum is : "+sum);
    }
}
