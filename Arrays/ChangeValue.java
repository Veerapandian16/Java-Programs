import java.util.Arrays;

public class change_value {
    public static void main(String[] args){
        int[] arr = {1,25,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0] = 99;
    }
    
}
