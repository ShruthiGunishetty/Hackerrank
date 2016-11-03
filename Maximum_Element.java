/** @author Shruthi Gunishetty
 ** Program to work with stack operations
 * input first line is the number of operations
 * followed by n operations,
 * 1 x ->add x to stack
 * 2   ->delete from stack the topmost element
 * 3   ->print the largest element within the stack
 * 
 */
package hacker;
import java.io.*;
import java.util.*;

public class Maximum_Element {
    //embedded class
   public static class Node{
        Integer ele;
        Integer max_ele;
        Node(int ele,int max_ele){
            this.ele=ele;
            this.max_ele=max_ele;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int max=0;
        int n=sc.nextInt();
        Stack<Node> s=new Stack<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            switch(x){
                case 1: int b=sc.nextInt();
                        if(max<b){
                            s.push(new Node(b,b));
                            max=b;
                        }
                        else{
                            s.push(new Node(b,max));
                        }
                        break;
                case 2: 
                            Node nl=s.pop();
                            if(!s.isEmpty()){
                            
                                max=s.peek().max_ele;
                            }
                            else
                                max=0;
                        
                        break;
                case 3:
                       System.out.println(max);
                       break;
            }
        }
        
}
}
/*Sample input and output:
 * 10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
output: 26
        91
*/
