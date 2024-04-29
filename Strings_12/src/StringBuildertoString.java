public class StringBuildertoString {  
    public static void main(String[] args) {  
        StringBuilder sb1 = new StringBuilder("programming");  
        System.out.println("string1 : "+sb1);  
        String str1 = sb1.toString();  
        System.out.println("string1 after toString() :"+str1);  
          
        StringBuilder sb2 = new StringBuilder("java");  
        System.out.println("string2 : "+sb2);  
        sb2.append("tpoint");  
        String str2 = sb2.toString();  
        System.out.println("string2 toString() after append :"+str2);  
    }  
}  
