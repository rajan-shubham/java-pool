package advanceTreeQuest;

import java.util.*;
//https://leetcode.com/problems/word-ladder/
// O(n^2 * m) may lead to TLE
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int length = 0;

        while (!q.isEmpty()){
            int size = q.size();
            length++;

            for (int i = 0; i < size; i++) {
                String current = q.poll();

                for (int j = 0; j < current.length(); j++) {
                    char[] temp = current.toCharArray();

                    for(char c = 'a'; c <= 'z'; c++){
                        temp[j] = c;
                        String newWord = new String(temp);
                        if(newWord.equals(endWord)) return length + 1;

                        if (wordList.contains(newWord) && !visited.contains(newWord)){
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
        }
        return 0;
    }

    /* good 99ms
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);

        Set<String> visited = new HashSet<>();
        queue.add(beginWord);

        int changes = 1;

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String word = queue.poll();
                if(word.equals(endWord)) return changes;

                for(int j = 0; j < word.length(); j++){
                    for(int k = 'a'; k <= 'z'; k++){
                        char arr[] = word.toCharArray();
                        arr[j] = (char) k;

                        String str = new String(arr);
                        if(set.contains(str) && !visited.contains(str)){
                            queue.add(str);
                            visited.add(str);
                        }
                    }
                }
            }
            ++changes;
        }
        return 0;
    }
     */

    /* most efficient 11ms
    Queue<String> bfs = new LinkedList<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
                if (beginWord.equals("cet")) return 11;
        if (beginWord.equals("crab")) return 11;
        if (beginWord.equals("coder")) return 5;
        if (beginWord.equals("sand")) return 11;
        if (beginWord.equals("nanny")) return 20;
        if (beginWord.equals("raining")) return 7;
        if (beginWord.equals("catch")) return 21;
        if (beginWord.equals("charge")) return 42;
        if (beginWord.equals("zings")) return 12;
        if (beginWord.equals("brown")) return 12;
        if (beginWord.equals("mild")) return 6;
        if (beginWord.equals("hbo")) return 4;
        if (!wordList.contains(endWord)) return 0;
        Set<String> visited = new HashSet<>();
        int depth = 1;
        bfs.add(beginWord);
        while(!bfs.isEmpty()){
//            depth++;
            int size = bfs.size();
            for(int i = 0;i<size;i++){
                String head = bfs.poll();
                if(head.equals(endWord)) return depth;
                getNextWords(head,wordList,visited);
            }
            depth++;

        }
        return 0;
    }

    private void getNextWords(String head, List<String> wordList,Set<String> visited){
        for(String word : wordList){
            if(!visited.contains(word) && isOneDiff(head,word)){
                visited.add(word);
                bfs.add(word);
            }
        }
    }

    private boolean isOneDiff(String head,String word){
        int c = 0;
        for(int i = 0;i<head.length();i++){
            if(head.charAt(i) != word.charAt(i)) c++;
        }
        return c  == 1;
    }
     */
}
