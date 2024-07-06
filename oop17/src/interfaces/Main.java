package interfaces;

// You should be careful not to use interfaces casually in performance-critical code (because it happens at runtime)
public class Main {
    public static void main(String[] args) {
        // from Car
//        Engine car = new Car(); // before it was Car car = new Car();

//        int carA = car.a;
//        car.start();car.stop();car.acc();//car.brake();

//        Media carMedia = new Car();
//        carMedia.stop();

        // from NiceCar
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
