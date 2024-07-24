public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node){
        if (index == 0){
            Node temp = new Node(value, node);
            size ++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;

        return value;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;

        prev.next = prev.next.next;

        return value;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // it will provide a reference pointer to that node of that index
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    // question
    public void duplicates(){
        Node node = head;

        while (node.next != null){
            if (node.next != null && node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // https://leetcode.com/problems/merge-two-sorted-lists/submissions/
    // merge two sorted list
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//
//        list.display();
//        list.duplicates();
//        list.display();

        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans = merge(first,second);
        ans.display();
    }
}
