public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--); {n--} -> pass the value n first, then it subtract(cause looping rec./Stack Overflow)
        fun(--n); //{--n} ->subtract the value first, then it pass
    }
}
