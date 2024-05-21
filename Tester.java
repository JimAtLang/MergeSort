public class Tester {
    public boolean isIncreasing(int[] arr){
        int prev = Integer.MIN_VALUE;
        for(int n:arr){
            if(n<prev){
                return false;
            }
            prev = n;
        }
        return true;
    }
}
