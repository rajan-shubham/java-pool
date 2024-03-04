public class NumExRecursion {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5
        print(1);
        System.out.println(add(10000,0));
    }

    static void print(int n) {
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is th last function call
        print(n+1);
    }

    static int add(int numupto, int acc){
        if(numupto == 0){
            return acc;
        }else {
            return add(numupto-1, (numupto + acc));
        }
    }
//    in OCAML --> TAIL RECURSIVE FUNCTION
//    let rec add numupto acc = if numupto = 0 then acc else add (numupto - 1) (numupto + acc);;
//    val add : int -> int -> int = <fun>
}
