package hacker;
import java.io.*;
import java.util.*;

public class StacksQueue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            switch(x){
                case 1:s1.push(sc.nextInt());
                       break;
                case 2:if(s2.isEmpty()){
                       while(!s1.isEmpty())
                           s2.push(s1.pop());
                }
                
                s2.pop();
                break;
                case 3:if(s2.isEmpty()){
                       while(!s1.isEmpty())
                           s2.push(s1.pop());
                }
                System.out.println(s2.peek());
                break;
            }
        }
        
        
        }
    }
