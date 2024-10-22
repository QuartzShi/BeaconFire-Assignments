package Q2;

import java.util.Scanner;
import java.util.stream.Stream;

public class OccurrenceOfMaxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = Stream.of(in.nextLine().split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();

        int maxValue = Integer.MIN_VALUE;
        int count = 0;
        for(int num : nums){
            if(num > maxValue){
                maxValue = num;
                count=1;
            } else if (num == maxValue) {
                count++;
            }
        }

        System.out.printf("The largest number is %d\n", maxValue);
        System.out.printf("The occurrence count of the largest number is %d\n", count);
    }
}
