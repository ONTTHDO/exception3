package exception3;

public class LAB3 {

    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("statement1");
            System.out.println(list[10]);
            System.out.println("statement3");
        }
        catch(ArithmeticException e){
        }
        finally{
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
