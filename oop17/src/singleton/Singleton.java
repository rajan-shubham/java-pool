package singleton;

// private means it will only be use in this file(Singleton.java) only

// In Singleton class you can create only one objet
public class Singleton {
//    private int num = 0;
    static String month;

    private Singleton (String month){
        Singleton.month = month;
    }

    private static Singleton instance;

    public static Singleton getInstance(String month){
        // check whether 1 obj only is created on not
        if(instance == null){
            instance = new Singleton(month);
        }

        return instance;
    }
}
