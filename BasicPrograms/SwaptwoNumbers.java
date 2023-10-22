/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

// Swap Two Numbers

import java.util.Scanner;
public class SwaptwoNumbers {
    public static void main(String args[]) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a=scanner.nextInt();
        System.out.print("Enter the second number: ");
        b=scanner.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("a="+a+",b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping: ");
        System.out.print("a= "+a+",b="+b);
    }
}
