// Java program to find minimum 
// (or maximum) element
// in an array.
import java.io.*;
public class MinMaxNum 
{

static int getMin(int arr[], int i, int n)
{
    // If there is single element, return it.
    // Else return minimum of first element and
    // minimum of remaining array.
    return (n == 1) ? arr[i] : Math.min(arr[i], 
                        getMin(arr,i + 1 , n - 1));
}

static int getMax(int arr[], int i, int n)
{
    // If there is single element, return it.
    // Else return maximum of first element and
    // maximum of remaining array.
    return (n == 1) ? arr[i] : Math.max(arr[i], 
                         getMax(arr ,i + 1, n - 1));
}

public static void main(String[] args) 
{
    int arr[] = { 12, 1234, 45, 67, 1 };
    int n = arr.length;
    System.out.print("Minimum element of array: " + 
                        getMin(arr, 0, n) + "\n");
    System.out.println("Maximum element of array: " + 
                        getMax(arr, 0, n));
    }
}
