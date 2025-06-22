public class pattern_3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            

            }
            System.out.println();
        }  
        System.out.println(); 
    
    }
}
