class LargestPairSum {
  // https://www.geeksforgeeks.org/problems/pair-sum--120604/1
    public static int pairsum(int[] arr) {
        // code here
        // int sum = 0, max = Integer.MIN_VALUE, maxsec = Integer.MAX_VALUE;
        // for(int i = 0; i<arr.length; i++){
        //     if(maxsec != max){
        //         sum = max;
        //     }
        //     max = Math.max(max, arr[i]);
        //     // maxsec = Math.min(arr[i], max);
        // }
        Integer max = null;
        Integer secondMax = null;

        for (int num : arr) {
            if (max == null || num > max) {
                secondMax = max; // Update second max before max
                max = num;       // Update max
            } else if ((secondMax == null || num > secondMax) && num != max) {
                secondMax = num; // Update second max if num is different from max
            }
        }
        return secondMax+max;
    }

  // more cleaner code O(n)
  // public int pairsum(vector<int> &arr) {
  //       // code here
  //       int fl=-1,sl=-1;
        
  //       for(int i=0;i<arr.size();i++){
  //           if(fl<arr[i]){
  //               sl=fl;
  //               fl=arr[i];
  //           }
  //           else if(sl<arr[i]){
  //               sl=arr[i];
  //           }
  //       }
  //       return fl+sl;
  //   }
}
