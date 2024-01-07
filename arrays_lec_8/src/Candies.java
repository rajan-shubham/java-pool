import java.util.ArrayList;
import java.util.List;

//class Solution {
//    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int size = candies.length;
//        boolean[] result = new boolean[size];
//
//        int[] tempcandies = candies;
//
//        for(int i=0; i<size; i++){
//            tempcandies[i] = tempcandies[i] + extraCandies;
//            boolean check = max(tempcandies,tempcandies[i]);
//            result[i] = check;
//            tempcandies = candies;
//
//        }
//        List<Boolean> resultList = new ArrayList<>();
//        for (boolean bool : result) {
//            resultList.add(bool);
//        }
//        return resultList;
//    }
//
//    static boolean max(int[] arr,int given){
//        int max = given;
//        for (int i = 1; i < arr.length; i++) {
//            if(max < arr[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//}

    class Candies {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int size = candies.length;
            boolean[] result = new boolean[size];

            //int[] tempcandies = candies;
            int[] tempcandies = candies.clone();

            for(int i=0; i<size; i++){
                tempcandies[i] = tempcandies[i] + extraCandies;
                boolean check = max(tempcandies,tempcandies[i]);
                result[i] = check;
                tempcandies = candies.clone();

            }
            List<Boolean> resultList = new ArrayList<>();
            for (boolean bool : result) {
                resultList.add(bool);
            }
            return resultList;
        }

        static boolean max(int[] arr,int given){
            //int max = given;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > given){
                    return false;
                }
            }
            return true;
        }
    }