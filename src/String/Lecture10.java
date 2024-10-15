package String;

import java.util.Scanner;

public class Lecture10 {
    public int[] solution(String s, char t){
        int[] answer = new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == t) p=0;
            else{
                p++;
                answer[i] = Math.min(p, answer[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Lecture10 T = new Lecture10();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char c = kb.next().charAt(0);
        for(int x : T.solution(s, c)) {
            System.out.print(x+ " ");
        }
    }
}
