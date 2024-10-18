class SingleNum {
  // https://www.geeksforgeeks.org/problems/single-number1014/1
    int getSingle(int arr[]) {
        // code here
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result = result ^ arr[i];
        }
        return result;
    }
}
