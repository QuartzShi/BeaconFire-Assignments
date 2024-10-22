package Q2;

import java.util.Random;

public class MergeSortedLinkedList {
    private static ListNode generateSortedLinkedList(int length){
        Random generator = new Random();
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for(int i=0; i<length; i++) {
            // Each node will have an increment of the previous node
            ListNode nextNode = new ListNode(head.val + generator.nextInt(1, 5));
            head.next = nextNode;
            head = nextNode;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = generateSortedLinkedList(5);
        ListNode l2 = generateSortedLinkedList(10);
        System.out.printf("L1: %s\n", l1.toString());
        System.out.printf("L2: %s\n", l2.toString());

        ListNode dummy = new ListNode();
        ListNode head = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                head.next = l1;
                head = head.next;
                l1 = l1.next;
            }
            else {
                head.next = l2;
                head = head.next;
                l2 = l2.next;
            }
        }

        if(l1 == null) { head.next = l2; }
        else if(l2 == null) { head.next = l1; }

        System.out.printf("Merged: %s\n", dummy.next.toString());
    }
}
