import java.util.Scanner;

//1. Напишите программу, где пользователь вводит любое целое положительное число. 
// А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x;
        int sum = 0;
        do {
            System.out.println(" Enter a positive x :");
            x = console.nextInt();
            if (x >= 1) {
                for (int i = 1; i <= x; i++) {
                    sum += i;
                }
            }
        }while(sum == 0);
        System.out.println("sum(1.." + x + ") = " + sum);
        }
    }
