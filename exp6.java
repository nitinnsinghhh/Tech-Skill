import java.util.Scanner;

public class exp6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target");
        int t=sc.nextInt();
        int[] rrr=new int[2];
        int a=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==t){
                    rrr[0]=i;
                    rrr[1]=j;
                   a=1;
                }
            }
        }
        if(a!=-1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        for(int i=0;i<2;i++){
            System.out.print("index=   "+rrr[i]+" ");
        }

}
}