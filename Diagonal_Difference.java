//Diagonal Difference--------------->>>>>>>



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       
       Scanner sc=new Scanner(System.in);
       
       int n=sc.nextInt();
       int[][] arr=new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       
       int suml=0;
       int sumr=0;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j){
                suml+=   arr[i][j];
               }
           }
           
            for(int j=0;j<n;j++){
               if(i+j==n-1){
                sumr+=   arr[i][j];
               }
           }
       }
       
       int diff=Math.abs(suml-sumr);
       
       
       System.out.println(diff);
    }
}
