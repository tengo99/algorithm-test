package String;

import java.util.Scanner;

public class Lecture07 {

    private String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        int len  = str.length();
        for(int i =0; i<len; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Lecture07 T = new Lecture07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }


}
