public class sorted {
    
    public static void main(String[] args) {
        int[] arr = { 4,5,6,7,1,0};
        int n = arr.length;
        
        boolean result = sorte(arr,n);
        System.out.println(result);

    }
    static boolean sorte(int[] arr,int n){
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;


    }
    
}
