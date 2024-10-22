package Q2;

import java.util.StringJoiner;

class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Code above is presented in question PDF
    // Below is the customized String representation of LinkedList

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("->");
        ListNode head = this;
        while(head != null){
            sj.add(String.valueOf(head.val));
            head = head.next;
        }

        return sj.toString();
    }
}