package String;

import java.util.Scanner;

public class Lecture05 {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0; int rt = s.length-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }


    public static void main(String[] args) {
        Lecture05 T = new Lecture05();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
