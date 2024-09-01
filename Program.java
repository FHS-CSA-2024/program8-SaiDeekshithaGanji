//import stuff here
import java.util.Scanner;
//Your code here

public class Program8{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        //create variables
        int num1 = 0;
        int num2 = 0;
        int numofnums = 0;
        
        //ask for input:
        System.out.print("Enter number 1: ");
        num1 = myScanner.nextInt();
        numofnums++;
        
        System.out.print("Enter number 2: ");
        num2 = myScanner.nextInt();
        numofnums++;
        
        int sum = Math.addExact(num1,num2);
        int difference = Math.subtractExact(num1,num2);
        int product = Math.multiplyExact(num1,num2);
        double average;
        int distance;
        int maximum;
        int minimum = 0;
        
        

        average = sum/2.0;
        distance = Math.abs(difference);
        maximum = ((num1 + num2) + distance)/2;
        minimum = ((num1 + num2) - distance)/2;
        
        //d =  Math.round(d * 1000.0) / 1000.0;
        //A =  (A * 1000.0) / 1000.0;
        //circ = (circ * 1000.0) / 1000.0;
        
        System.out.println("\n\nOriginal number are " + num1 + " and " + num2 );
        System.out.println("\nSum = " + sum );
        System.out.println("\nDifference = " + difference);
        System.out.println("\nProduct = " + product );
        System.out.println("\nAverage = " + average);
        System.out.println("\nAbsoulute Value = " + distance);
        System.out.println("\nMaximum = " + maximum);
        System.out.println("\nMinimum = " + minimum);
        
        
    
    
    }
}


//Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20


Original number are 13 and 20

Sum = 33

Difference = -7

Product = 260

Average = 16.5

Absoulute Value = 7

Maximum = 20

Minimum = 13
*/
