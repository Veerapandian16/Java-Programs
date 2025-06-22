public class second_lrgest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,32,7,4,10};
        int[] result = check(arr);
        System.out.println("Laregest number of list :" + result[0]);
        System.out.println("Second largest number in list: " + result[1]);


    }
    static int[] check(int[] arr){
        int max = arr[0];
        int max2 = arr[1];
        for(int i : arr){
            if(i>max){
                max = i;
            }
            else if(i > max2 && i != max){
                max2 = i;
            }
        }
        return new int[]{max,max2};
    }

        

    

    
}
