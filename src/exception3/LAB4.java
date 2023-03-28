package exception3;

public class LAB4 {

    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("statement1");
            System.out.println(list[10]);
            System.out.println("statement3");
        }
        catch(ArithmeticException e){
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            throw new RuntimeException();
        }
        finally{
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
