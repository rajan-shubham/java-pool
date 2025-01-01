class AnagramsTogether {
  // https://www.geeksforgeeks.org/problems/print-anagrams-together/1
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        TreeMap<String, ArrayList<String>> mp = new TreeMap<>();
        int n = arr.length;
        
        for (String s : arr) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            
            mp.putIfAbsent(str, new ArrayList<>());
            mp.get(str).add(s);
        }
        
        return new ArrayList<>(mp.values());
    }
}
