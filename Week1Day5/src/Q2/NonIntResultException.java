package Q2;

public class NonIntResultException extends Exception {
    public NonIntResultException(int a, int b) {
        super(a + " divided by " + b + " is not an integer");
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        try {
            if(a % b !=0) {
                throw new NonIntResultException(a, b);
            }
            else {
                System.out.println("Result:" + a/b);
            }
        } catch (NonIntResultException e) {
            System.out.println(e.getMessage());
        }
    }
}
