package Array;

import java.util.Scanner;

public class Lecture04 {

    public void solution(int n){
        int a=1 ,b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i<n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
         Lecture04 T = new Lecture04();
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         T.solution(n);
    }
}
