package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // Exception in thread "main" java.lang.ArithmeticException: / by zero -> at exceptionHandling.Main.main(Main.java:7)
        try {
//            divide(a, b);
            // mimicking
//            throw new Exception("Just For Fun");

            String name = "shubham";
            if (name.equals("shubham")){
                throw new MyException("Name is shubham");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception");
        } finally {
            System.out.println("This will always execute, No matter what happen above with try & catch");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Please Do not Divide by Zero");
        }
        return a / b;
    }
}
