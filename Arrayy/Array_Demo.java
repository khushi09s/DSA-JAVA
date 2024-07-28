package Arrayy; //folder

public class Array_Demo { // class name should be same as file name in JAVA ; Array is also a class in
                          // JAVA
    public static void main(String[] args) { // From this line our main starts
        int arr[] = new int[5]; // It is a way to initialize an array ; here we created an array of 5 size
        System.out.println(arr); // [I@372f7a8d = output = we are getting the address of the array of size 5
        arr[0] = 9;
        arr[1] = 10;
        arr[2] = 11;
        arr[3] = 9;
        arr[4] = 8;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}