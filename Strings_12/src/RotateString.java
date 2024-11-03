// class Solution {

// https://leetcode.com/problems/rotate-string/?envType=daily-question&envId=2024-11-03

//     public boolean rotateString(String s, String goal) {
//         if(s.length() != goal.length()){
//             return false;
//         }


//         int k = 0;
//         for(int i = 0; i<s.length()-1; i++){
//             if(s.charAt(0) == goal.charAt(i)){
//                 k = i;
//                 break;
//             }
//         }


//         for(int i = 0; i<s.length()-1; i++){
//             if(s.charAt(i) == goal.charAt(k)){
//                 k++;
//                 k = k%s.length();
//             }else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Concatenate s with itself and check if goal is a substring
        String doubleS = s + s;
        return doubleS.contains(goal);
    }
}
