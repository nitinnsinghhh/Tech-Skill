import java.util.*;
import java.util.Scanner;

public class exp4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                count+=max-arr[i];
            }
        }
        System.out.println(count);

        
    }
}