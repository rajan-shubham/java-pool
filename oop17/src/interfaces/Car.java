package interfaces;

public class Car implements Engine, Brake, Media{
    int a = 42;

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start Engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stops Engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }
}
