class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i];
        }
        for(int i=0;i<b.length;i++){
            sum2+=b[i];
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
}
