// equilibrium index
import java.util.*;
import java.util.Scanner;

public class exp3 {
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
        int [] sum =new int[n];
        int [] l_sum=new int[n];
        int [] r_sum=new int[n];
        sum[0]=arr[0];
        for(int i = 1;i<n;i++){
            sum[i]=arr[i]+sum[i-1];
        }
        for(int i = 0;i<n;i++){
           l_sum[i]=sum[i]-(arr[i]);
        }
        for(int i = 0;i<n;i++){
            r_sum[i]=sum[n-1]-sum[i];
        }
        //print sum
        for(int i = 0;i<n;i++){
            System.out.print(sum[i]+" ");;
        }
        System.out.println("\n --------------------------");
        //print leftsum
        for(int i = 0;i<n;i++){
            System.out.print(l_sum[i]+" ");
            }
        System.out.println("\n --------------------------");
        //print right sum
        for(int i = 0;i<n;i++){
            System.out.print(r_sum[i]+" ");;
        }
        for(int i=0;i<n;i++){
            if(l_sum[i]==r_sum[i]){
                count++;
            }
        }
        System.out.println("\n ----------------------");
        System.out.println(" Equilibrium Count=   "+count );
        }

    }