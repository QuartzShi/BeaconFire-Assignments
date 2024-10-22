package Q2;

import java.util.Random;

public class removeOddFromLinkedList {
    private static ListNode generateLinkedList(int length){
        Random generator = new Random();
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        for(int i=0; i<length; i++) {
            // Each node will have an increment of the previous node
            ListNode nextNode = new ListNode(generator.nextInt(1, 20));
            head.next = nextNode;
            head = nextNode;
        }

        return dummy;
    }

    public static void main(String[] args) {
        ListNode ln = generateLinkedList(10);
        System.out.printf("Original LinkedList:%s\n", ln.next.toString());

        ListNode head = ln;

        while(head != null) {
            while(head.next != null && head.next.val % 2 == 1){
                head.next = head.next.next;
            }
            head = head.next;
        }
        System.out.printf("New LinkedList:%s\n", ln.next.toString());
    }
}
