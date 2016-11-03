package hacker;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        HashMap<Character,Character> hm=new HashMap<>();
            hm.put('(',')');
            hm.put('[',']');
            hm.put('{','}');
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            boolean b=true;
            Stack<Character> stack=new Stack<>();
            for(char c:s.toCharArray()){
                if(c=='['||c=='{'||c=='(')
                    stack.push(c);
                else{
                     
                     if(stack.isEmpty() || hm.get(stack.pop())!=c){
                         b=false;
                         break;
                         
                     }
                         
                }
            }
            if(b==false || !stack.isEmpty())
                System.out.println("NO");
            else 
                System.out.println("YES");
            
        }
        
    }
}
