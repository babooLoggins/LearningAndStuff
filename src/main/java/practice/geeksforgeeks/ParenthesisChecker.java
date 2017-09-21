package main.java.javaProgrammingClass.amazonPractice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ParenthesisChecker {
    public static void main (String[] args) {
        Scanner sysIn = new Scanner(System.in);
        int numRounds = sysIn.nextInt();
        for(int i=0; i<numRounds; i++){
            char[] input = sysIn.nextLine().toCharArray();
            Stack<Character> pq = new Stack();
            String result = "balanced";
            int position = 0;
            int lengthInput = input.length;
            while(result.equals("balanced") && position<lengthInput){
                char test = input[position];
                switch(test) {
                    case '{' : pq.push('}');
                        break;
                    case '(' : pq.push(')');
                        break;
                    case '[' : pq.push(']');
                        break;
                    case '}' : {
                        if(pq.isEmpty() || !pq.pop().equals('}')){
                            result = "not balanced";
                        };
                    }
                    case ']' : {
                        if(!pq.pop().equals(']')){
                            result = "not balanced";
                        };
                    }
                    case ')' : {
                        if(!pq.pop().equals(')')){
                            result = "not balanced";
                        };
                    }
                }
            }
            System.out.println(result);
        }
    }
}