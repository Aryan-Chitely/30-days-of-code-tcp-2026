import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        int N;
        long D;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        D=sc.nextLong();
        long[] Power=new long[N];
        for(int i=0;i<N;i++){
            Power[i]=sc.nextLong();
        }
        Arrays.sort(Power);
        reverse(Power);
        int wins=0,i=0;
        while(i<N){
            long mxPow=Power[i];
            long k=D/mxPow+1;

            if(i+k<=N){
                wins++;
                i+=k;
            } else{
                break;
            }
        }
        System.out.println(wins);
    }
        static void reverse(long[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            long temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

}