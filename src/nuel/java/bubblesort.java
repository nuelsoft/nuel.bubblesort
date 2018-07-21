//Author: nuel...

package nuel.java;
import java.util.Scanner;

public class bubblesort {
    private static Scanner scanner = new Scanner(System.in);
    private static int arr[];
    private static int sec_arr[];
    private static String input = "";
    private static String output = "";
    public static void sort(){
        System.out.println("Welcome, I'm nuel's bubblesort algorithm, and I sort numbers");
        boolean quit = false;
        printActions();
        while(!quit){
            System.out.println("Enter choice [3 to print actions] - > ");
            int action = scanner.nextInt();
            if(action < 0){
                System.out.println("invalid choice!");
            }
            else{
                switch (action){
                    case 1: ascending();
                            break;
                    case 2: descending();
                            break;
                    case 0: System.out.println("...shutting down");
                            quit = true;
                            break;
                    case 3: printActions();
                            break;
                    default:
                            System.out.println("invalid choice");
                            printActions();
                            break;
                }
            }

        }
    }
    public static void printActions(){
        System.out.println("1-- Ascending Order \n" +
                            "2-- Descending Order \n" +
                            "0-- Shut down");
    }
    public static boolean validate(){
        System.out.println("How many numbers to sort: ");
        int size = scanner.nextInt();
        if(size < 1){
            System.out.println("invalid choice");
            printActions();
            return false;
        }
        else{
            arr = new int[size];
            sec_arr = new int[size];
            for(int i = 0; i < size; i++) {
                System.out.println("Enter number : " + (i + 1));
                arr[i] = scanner.nextInt();
            }
//            filling the input String container
            for(int m = 0; m < arr.length; m++){
                if (m == 0) {
                    input += arr[m];
                } else {
                    input += ", " + arr[m];
                }
            }
            return true;
        }

    }
    public static void ascending(){
        int temp;
        if(validate()) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length-1; k++) {
                    if (arr[k] > arr[k + 1]) {
                        temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                        sec_arr[k] = arr[k];
                    }

                    sec_arr[k + 1] = arr[k + 1];
                }
            }
            for (int l = 0; l < sec_arr.length; l++) {
                if (l == 0) {
                    output += sec_arr[l];

                } else {
                    output += ", " + sec_arr[l];
                }
            }
        }
        System.out.println("This is what you gave me : " + input + "\n" +
                            "After sorting, I came up with this : " + output);
        input = "";
        output = "";
    }
    public static void descending(){
        int temp;
        if(validate()) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length-1; k++) {
                    if (arr[k] < arr[k + 1]) {
                        temp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = temp;
                        sec_arr[k] = arr[k];
                    }

                    sec_arr[k + 1] = arr[k + 1];
                }
            }
            for (int l = 0; l < sec_arr.length; l++) {
                if (l == 0) {
                    output += sec_arr[l];
                } else {
                    output += ", " + sec_arr[l];
                }
            }
        }
        System.out.println("Re-ordering [  " + input + " ] \n" +
                            "in descending order returned this : " + input);
        input =  "";
        output =  "";
    }
}
