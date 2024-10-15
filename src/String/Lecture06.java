package String;

import java.util.Scanner;

public class Lecture06 {
    public String solution(String str){
        String answer="";
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        Lecture06 T = new Lecture06();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

