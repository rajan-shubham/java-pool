import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    // Initializing the heap
    public Heap(){
        list = new ArrayList<>();
    }

    // Swapping of two element in heap (taking index of two element)
    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    // Getting the parent index from it's child index
    private int parent(int index){return (index - 1) / 2;}

    // Getting the left child index of current node(element)
    private int left(int index){return index*2 + 1;}

    // Getting the right child index of current node(element)
    private int right(int index){return index*2 + 2;}

    // Inserting the value in Heap
    public void insert(T value){
        list.add(value);
        upHeap(list.size() - 1);
    }
    // Comparing upward log(n) times for right position of inserted element
    private void upHeap(int index){
        if(index == 0) return; // if inserted node is first node or as a base case
        int p = parent(index); // getting parent index
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p); // swapping with help of two index
            upHeap(p); // upHeap for same element as parent
        }
    } 

    // Removing min element
    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from an empty heap!");
        }
        T temp = list.get(0); // gettng min element form index 0
        T last = list.remove(list.size() - 1); // getting last element from heap
        if(!list.isEmpty()){
            list.set(0, last); // setting the 0th index wiht the last element(value)
            downHeap(0); // now adjusing the heap for min heap by down comparision log(n) times
        }
        return temp;
    }
    // Comparing downward log(n) times for right position of last inserted element at 0th index
    private void downHeap(int index){
        int min = index; // settn the current index as minimum element 
        int left = left(index); // getting the left child index
        int right = right(index); // gettin the right child index

        // if the current min indexed element is greater then the left child, it means that left child indexed is minimum
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) min = left;

        // if the current min indexed element is greater then the right child, it means that right child indexed is minimum
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) min = right;

        if(min != index){
            swap(min, index); // swapping current minimum element with it's parent(current element)
            downHeap(min); // downHeap for same element as parent
        }
    }

    // HeapSort: while heap is not empty keep removing element and put that element in array
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){data.add(this.remove());}
        return data;
    }
}