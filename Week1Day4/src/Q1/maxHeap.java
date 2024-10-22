package Q1;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class maxHeap {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq =
                // 1. Use Collections.reverseOrder() for types with natural order
                // new PriorityQueue<>(Collections.reverseOrder());
                // 2. Use Comparator(Lambda)
                new PriorityQueue<>((a,b)->b-a);

        pq.addAll(Arrays.asList(2, 4, 3, 1));
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
