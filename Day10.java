import java.util.Arrays;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
       int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
       sort012(arr);
    }
    public static void sort012(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            } else if (arr[mid]==1)
                mid++;
                else{
                    swap(arr,mid,high);
                    high--;
                }
                
            }
        System.out.println(Arrays.toString(arr));        
        
    }
    public static void swap (int[] arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}