package Q6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MathematicalCalculator {
    public static void main(String[] args) {
        int[] input1 = {5, 6, 14, 7};
        String[] input2 = {"Add", "Sub", "Div"};

        int result = calculate(input1, input2);
        System.out.println("Result: " + result);
    }

    private static int calculate(int[] numbers, String[] operations){
        List<Integer> nums = new LinkedList<>();
        List<String> addAndSub = new LinkedList<>();
        nums.add(numbers[0]);

        for(int i=0; i < operations.length; i++){
            String op = operations[i];
            if(op.equals("Mul")){
                int num1 = nums.remove(nums.size()-1);
                int num2 = numbers[i+1];
                nums.add(num1 * num2);
            } else if (op.equals("Div")) {
                int num1 = nums.remove(nums.size()-1);
                int num2 = numbers[i+1];
                nums.add(num1 / num2);
            } else {
                nums.add(numbers[i + 1]);
                addAndSub.add(op);
            }
        }

        int result = nums.get(0);
        for(int i=0; i < addAndSub.size(); i++){
            if(addAndSub.get(i) == "Add"){
                result += nums.get(i+1);
            } else if (addAndSub.get(i) == "Sub") {
                result -= nums.get(i+1);
            }
        }

        return result;
    }
}
