package Q3;

import java.util.StringJoiner;

class Node
{
    int key;
    int value;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    Node(int key, int value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("<->");
        Node head = this;
        while(head != null){
            sj.add(String.valueOf(head.value));
            head = head.next;
        }

        return sj.toString();
    }
}