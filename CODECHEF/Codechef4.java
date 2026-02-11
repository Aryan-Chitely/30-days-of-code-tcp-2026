import java.util.*;
import java.lang.*;
import java.io.*;
public class Codechef4 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            
            int s = sc.nextInt();   
            
            int []a = new int[s];
            int []b = new int[s];
            
            for (int i = 0; i < s; i++) {
                a[i] = sc.nextInt();
            }
            
            for (int i = 0; i < s; i++) {
                b[i] = sc.nextInt();
            }
            
            int [] diff = new int[s];
            
            for (int i = 0; i < s; i++) {
                diff[i] = a[i] - b[i];
            }
            
            Arrays.sort(diff);
            
            int sm = 0;
            for (int i = 0; i < s; i++) {
                sm += a[i];
            }
            
            System.out.println(sm - diff[0]);  
        }
        
        sc.close();  
    }
}
}
