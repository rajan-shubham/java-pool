package enumExample;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // all members are --> public static & final
        // since its final you can't create child enums
        // type is Week of every members

        Week(){
            System.out.println("Constructor called for " + this.toString());
        }

        @Override
        public void hello() {
            System.out.println("Hey, How are you!");
        }
        // this is not public or protected, only private or default
        // Why? --> we don't want to create any new object
        // because this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
        // compare enum by == (relational operator)
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(week.valueOf("Monday"));

//        for(Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
