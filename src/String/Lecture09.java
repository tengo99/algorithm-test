package String;

import java.util.Scanner;

public class Lecture09 {

    public int solution(String str){
        int answer  =0;
        for(char x : str.toCharArray()){
            if(x>=48 && x<=57) answer = answer*10+(x-48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Lecture09 T = new Lecture09();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
