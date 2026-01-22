import java.util.*;
public class exp2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            System.out.println(sum);
        }
    }
}