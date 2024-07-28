package Arrayy;

import java.util.Scanner;

public class Arrayy_Innput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Is used for user input
        int n = sc.nextInt(); // we are taking value of n from user
        int arr[] = new int[n]; // n size array , array created
        for (int i = 0; i < arr.length; i++) { // for taking input from user in array
            arr[i] = sc.nextInt();// array values on each index
        }
        Display(arr); // calling the function in main for void type we don't need to use anything we
                      // just call the name
    }

    public static void Display(int arr[]) { // created a function of name Display in which we pass our array
        for (int i = 0; i < arr.length; i++) { // used for printing the element in the array ;
            System.out.println(arr[i]);// printing of the array
        }
    }

}
