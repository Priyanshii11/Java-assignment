//Q39 - WAP which enter any integer from 1-3 and print in word. if the given value is beyond the range than it gives mgs out of rang.

import java.util.*;
public class q39 {
    public static void main(String[] args) {
        System.out.println("enter the number b/w 1-3");
        Scanner pri=new Scanner(System.in);
        int a=pri.nextInt();
        switch (a)
        {
        case 1:
        System.out.println("one");
        break;
        case 2:
        System.out.println("two");
        break;
        case 3:
        System.out.println("three");
        break;
        default:
        System.out.println("out of range");
        break;
        }
    }
    
}
