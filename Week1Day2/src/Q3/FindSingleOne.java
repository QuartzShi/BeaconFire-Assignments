package Q3;

public class FindSingleOne {
    public static void main(String[] args) {
//        int[] nums = {2,2,1};
        int[] nums = {4,1,2,1,2};

        int result=0;
        for(int num : nums){
            result = result ^ num;
        }
        System.out.println(result);
    }
}
