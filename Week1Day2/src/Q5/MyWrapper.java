package Q5;

public class MyWrapper {
    private int value;

    public MyWrapper(int value){
        this.value = value;
    }

    public int intValue(){
        return this.value;
    }

    public short shortValue(){
        return (short) this.value;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof MyWrapper){
            MyWrapper other = (MyWrapper) obj;
            return this.value == other.value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);  // Return hash based on int value
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
