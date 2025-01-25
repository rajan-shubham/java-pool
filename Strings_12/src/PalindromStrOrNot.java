public class PalindromStrOrNot {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome14ms(str));
    }

    static boolean isPalindrome14ms(String str) {
        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        // arr.length --> in this length is actually a variable
        // str.length() --> in this length() is a function/method, internally it's doing the same thing
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome13ms(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // 1ms
    public boolean isPalindrome1ms(String s) {
        char[] ch=s.toCharArray();
        int p=0;
        for(int i=0;i<ch.length;i++){
            if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||(ch[i]>='0'&&ch[i]<='9')){
                if((ch[i]>='A'&&ch[i]<='Z'))
                    ch[p]=(char)(ch[i]-'A'+'a');
                else
                    ch[p]=ch[i];
                p++;
            }

        }
        int l=p-1;
        for(int i=0;i<p/2;i++){
            if(ch[i]!=ch[l])
                return false;
            l--;
        }
        return true;
    }
}
