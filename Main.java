package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        Long num;
        long num_1;
        long num_2;
        while(true){
            System.out.println("Select calculation type (with numbers)");
            System.out.println("[1]+\n[2]-\n[3]*\n[4]/\n[5]Exit\n");
            int work = scanner.nextInt();
            switch (work) {
                case 1:
                    System.out.print("Please enter the first volume: ");
                    num_1 = scanner.nextLong();
                    System.out.print("Please Enter the second value: ");
                    num_2 = scanner.nextLong();
                    num = num_1 + num_2;
                    System.out.println("The amount of your output: ");
                    System.out.println(num_1 + "+" + num_2 + "=" + num+'\n');
                    break;
                case 2:
                    System.out.print("Please enter the first volume: ");
                    num_1 = scanner.nextLong();
                    System.out.print("Please Enter the second value: ");
                    num_2 = scanner.nextLong();
                    num = num_1 - num_2;
                    System.out.println("The amount of your output: ");
                    System.out.println(num_1 + "-" + num_2 + "=" + num+'\n');
                    break;
                case 3:
                    System.out.print("Please enter the first volume: ");
                    num_1 = scanner.nextLong();
                    System.out.print("Please Enter the second value: ");
                    num_2 = scanner.nextLong();
                    num = num_1 * num_2;
                    System.out.println("The amount of your output: ");
                    System.out.println(num_1 + "*" + num_2 + "=" + num+'\n');
                    break;
                case 4:
                    System.out.print("Please enter the first volume: ");
                    num_1 = scanner.nextLong();
                    System.out.print("Please Enter the second value: ");
                    num_2 = scanner.nextLong();
                    num = num_1 / num_2;
                    System.out.println("The amount of your output: ");
                    System.out.println(num_1 + "/" + num_2 + "=" + num + '\n');
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter a correct volume!\n");
            }
        }
    }
}
