import java.util.*;
public class exp8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row=sc.nextInt();
        System.out.println("Enter column");
        int col=sc.nextInt();
        int[][]arr=new int[row][col];
        int num=0;
        for(int i=0;i<row;i++){
              for(int j=0;j<col;j++){
                num+=1;
                arr[i][j]=num;
                System.out.print(arr[i][j]+"  ");
              }
              System.out.println();               
        }
        int plus=0;
        for(int i=0;i<row;i++){
              for(int j=0;j<col;j++){
                if (i==j){
                    plus+=arr[i][j];
                }
                }
            }
        System.out.println(plus);
    }
}
