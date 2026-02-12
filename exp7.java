import java.util.*;

public class exp7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int s_max=arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max=  "+max);
        for(int i=0;i<n;i++){
            if(arr[i]>s_max & arr[i]<max){
                s_max=arr[i];
            }
        }
        System.out.println("S_max   " +s_max);
    }
}
