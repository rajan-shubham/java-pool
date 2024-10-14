class CartisionProduct {
    public static void main(String[] args) {
        String[] symbol = {"a", "b", "c", "d", "e"};
        String[] cp = cprod(symbol);
        for(int i = 0; i<cp.length; i++){
            System.out.print(cp[i] + " ");
        }
        System.out.println("\nSize of Cartision Product's");
        System.out.println(cp.length);
    }
    
    public static String[] cprod(String[] symbol){
        String[] sb = new String[symbol.length * symbol.length];
        int count = 0;
        for(String ch : symbol){
            for(String it : symbol){
                sb[count++] = ch+it;
            }
        }
        return sb;
    }
}
