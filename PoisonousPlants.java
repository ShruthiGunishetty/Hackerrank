package hacker;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PoisonousPlants {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int cnt=0;
        int cnt1=0;
        int n=s.nextInt();
        int arr[]=new int[n];
        int scurr=0,sprev=0;
         List<Integer> l=new LinkedList<>();
        //Iterator<Integer> it1=l.iterator();
        
        for(int i=0;i<n;i++){
            //arr[i]=s.nextInt();
            l.add(s.nextInt());
        }
       
         sprev=l.size();
       
       
        int i=1;
        int temp=l.get(0);
        while(true){
        	//System.out.println("i "+i);
            int a=l.get(i);
            cnt1++;
            //System.out.println(a);
           if(temp<a){
              l.remove(i);
              //System.out.println("removed");
              i--;
           }
      
           temp=a;
            i++;
            if(cnt1+1==sprev){
                cnt++;
                 scurr=l.size();
                if(scurr==sprev)
                    break;
                else{
                    sprev=scurr;
                    i=1;
                    temp=l.get(0);
                }
                cnt1=0;
            }
                
                
            
        }
        System.out.println(cnt-1);
    }
}
/*Sample input:
	7
	6 5 8 4 7 10 9
	output : 2*/
	