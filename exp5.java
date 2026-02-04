import java.util.Scanner;

public class exp5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=1;
        a[0]=0;
        for(int i=1;i<n;i++){
            p*=a[i];
        }
        for(int i=1;i<n;i++){
            a[i]=p/a[i];
        }
         for (int i=0;i<n;i++){
            System.out.println(a[i]+" ");
         }

}}
