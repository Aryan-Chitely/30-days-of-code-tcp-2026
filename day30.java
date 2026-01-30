
class Solution {
    
    ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        int m=a.length;
        int n=b.length;
        for(int i=0;i<m;i++){
            if(i>0 && a[i-1]==a[i])
                continue;
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    res.add(a[i]);
                    break;
                }
            }
        }
        return res;
    }
}