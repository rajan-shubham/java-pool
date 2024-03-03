public class Message {
    public static void main(String[] args) {
        // write a function that prints hello world
        message();
        System.out.println("every call done.");
    }

    static void message(){
        System.out.println("Hello world!1");
        message1();
        System.out.println("end!");
    }

    static void message1(){
        System.out.println("Hello world!2");
        message2();
    }
    static void message2(){
        System.out.println("Hello world!3");
        message3();
    }
    static void message3(){
        System.out.println("Hello world!4");
        message4();
    }
    static void message4(){
        System.out.println("Hello world!5");
    }
}