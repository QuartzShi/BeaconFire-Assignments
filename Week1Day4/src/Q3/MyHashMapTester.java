package Q3;

public class MyHashMapTester {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(1, 15);


        System.out.println("1->" + map.get(1));
        System.out.println("2->" + map.get(2));
        System.out.println("3->" + map.get(3));
    }
}
