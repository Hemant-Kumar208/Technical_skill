/*given an integer array a of size n
 in 1 second you can increase a value of one by one .
find the minimum time in second to make all elements of array equal.*/

import java.util.Scanner;

public class time_to_make_elements_equal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = a[0];
        System.out.println("Enter elements: ");
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i =0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(" ");
        int time = 0;
        for(int i =0;i<a.length;i++){
            time = time + (max - a[i]);
        }
        System.out.println("time required to  make all elemnts equal: "+time+" seconds");
    }
}

//observation
//to minimize time make all element equal to the max in the arr
//find the max in element the array
//for every element calculate how much it needs to be increased to reach the maximum
