public class Scope {
    public static void main(String[] args) {
        // scope -> Where we can access our variables.
        int a = 35;
        int b = 23;
        String name = "kunal";
        {
            //int a = 78; you can't initiliaze it again in main function scope. ,
            // already initialised outside the block in the same method, hence you cannot intitalise again


            a = 78;
            System.out.println(a);
            int c = 99;
            // value initialised in this block, will remain in this block
            name = "shubham";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);


        //System.out.println(c); // c is not accessible here, because it is initialize in another scope

        //System.out.println(num);
        for (int i = 0; i < 4; i++){
            System.out.println(i);
        }
    }

    static void random(int marks){
        int num = 67;
        //System.out.println(a);
        System.out.println(marks);
    }
}
