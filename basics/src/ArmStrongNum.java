public class ArmStrongNum {
    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }

    static boolean isArmStrong(int num){
        int originalNum = num;
        int size = String.valueOf(num).length();
        double result = 0;

        while (num > 0){
            int digit = num % 10;
            result += Math.pow(digit, size);
            num /= 10;
        }
        return originalNum == (int)result;
    }
}
