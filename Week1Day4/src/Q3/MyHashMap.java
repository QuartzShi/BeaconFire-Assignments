package Q3;

public class MyHashMap {

    Node[] table;

    public MyHashMap() {
        this(8);
    }
    public MyHashMap(int capacity){
        this.table = new Node[capacity];
    }

    public void put(int key, int value) {
        int hash = Integer.hashCode(key);
        int index = hash % this.table.length;
        Node newNode = new Node(key, value);

        if(table[index] == null) {
            table[index] = newNode;
        }
        else {
            Node head = table[index];
            Node prev = null;

            while(head != null){
                if(head.key == key){
                    head.value = value;
                    return;
                }
                prev = head;
                head = head.next;
            }

            prev.next = newNode;
        }
    }

    public int get(int key) {
        int hash = Integer.hashCode(key);
        int index = hash % this.table.length;
        Node thisNode = table[index];

        while (thisNode != null) {
            if(thisNode.key == key) return thisNode.value;
            thisNode = thisNode.next;
        }

        return -1;
    }
}