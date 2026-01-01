public class IntersectionInYShapedLists {
    /*
    https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
You are given the heads of two non-empty singly linked lists, head1 and head2, that intersect at a certain point. Return that Node where these two linked lists intersect.

Note: It is guaranteed that the intersected node always exists.

In the custom input you have to give input for CommonList which pointed at the end of both head1 and head2 to form a Y-shaped linked list.
     */
    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public Node intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null) return null;

        Node ptr1 = head1;
        Node ptr2 = head2;

        // Loop continues until the pointers meet
        while (ptr1 != ptr2) {
            // If ptr1 reaches the end, jump to head of list 2
            // Otherwise, move to the next node
            ptr1 = (ptr1 == null) ? head2 : ptr1.next;

            // If ptr2 reaches the end, jump to head of list 1
            // Otherwise, move to the next node
            ptr2 = (ptr2 == null) ? head1 : ptr2.next;
        }

        // Either they meet at the intersection, or both are null (no intersection)
        return ptr1;
    }

    /* TLE because (N*M)
    public Node intersectPoint(Node head1, Node head2) {
        Node node = head1;

        // Outer loop: Iterate through every node in List 1
        while (node != null) {
            Node ptr = head2;

            // Inner loop: Check if 'node' exists anywhere in List 2
            while (ptr != null) {
                // Compare references (memory addresses), not data
                if (node == ptr) {
                    return node;
                }
                ptr = ptr.next;
            }
            node = node.next;
        }

        return null;
    }
     */
}
