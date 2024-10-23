public class SumofLastNnode {
    public class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

//    https://www.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1

    public static int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node length = head;
        int count = 0, sum = 0;
        while(length != null){
            count++;
            length = length.next;
        }

        count = count - n;
        length = head;

        while(count != 0){
            length = length.next;
            count--;
        }

        while(length != null){
            sum = sum + length.data;
            length = length.next;
        }

        return sum;
    }
}
