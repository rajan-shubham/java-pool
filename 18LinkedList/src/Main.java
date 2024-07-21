public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
//        System.out.println(list.find(3));
        list.insertRec(88, 2);
        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();


//        CLL list = new CLL();
//        list.insert(10);
//        list.insert(11);
//        list.insert(12);
//        list.insert(13);
//        list.insert(14);
//        list.insert(15);
//
//        list.delete(10);
//
//        list.display();
//
//        list.delete(14);
//
//        list.display();
//        System.out.println(5 + "3");
    }
}
