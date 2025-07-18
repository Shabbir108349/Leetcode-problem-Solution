
/*

This question I have got from hackerRank platform. where the name of the problem is Java Loop 2;
here's the link---
https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

*/

import java.util.Scanner;

public class VitalQuestion {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int query = sc.nextInt();
        
        for(int i=0; i<query; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int first = a+b;
             int pow = 2;
            int result = first;
            System.out.print(first+" ");
            for(int j=1; j<n; j++){
               result = result+(b*pow);
               pow*= 2;
               System.out.print(result+ " ");
            }
            System.out.println();
        }
    }
}
