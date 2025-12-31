public class PalindromeLL {
    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // TC = O(N) SC = O(1)
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // 1. Find the middle of the linked list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half of the list
        Node secondHalfHead = reverseList(slow);
        Node firstHalfHead = head;

        // 3. Compare the two halves
        Node temp = secondHalfHead; // Keep a reference to reverse it back later
        boolean result = true;
        while (secondHalfHead != null) {
            if (firstHalfHead.data != secondHalfHead.data) {
                result = false;
                break;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        // 4. (Optional) Restore the list by reversing back
        // reverseList(temp);

        return result;
    }

    private Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

//    TC = O(N) SC = O(N)
    /*
    public boolean isPalindrome(Node head) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Node node = head;
        while(node != null){
            al.add(node.data);
            node = node.next;
        }
        return isPalin(al);
    }

    private boolean isPalin(ArrayList<Integer> al){
        int start = 0, end = al.size()-1;
        while(start <= end){
            if(!al.get(start++).equals(al.get(end--))) return false;
        }
        return true;
    }
     */
}
